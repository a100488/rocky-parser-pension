package com.guige.parser.service.impl;
import com.guige.base.util.MessageUtil;
import com.guige.parser.model.dto.CellIndexDto;
import com.guige.parser.model.dto.ResultParserDto;
import com.guige.parser.model.vo.ParserXlsVo;
import com.guige.parser.model.vo.SpecialValueVo;
import com.guige.parser.model.vo.TitleVo;
import com.guige.parser.service.CallBack;
import com.guige.parser.service.ParserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Poi解析表格
 *
 * @author Song.aw
 * @create 2017-10-31 10:05
 **/
@Slf4j
@Service("poiParserService")
public class PoiParserServiceImpl implements ParserService {

    @Override
    public ResultParserDto parserXlsFile(Workbook book, ParserXlsVo parserXlsVo, CallBack callBack) {
        ResultParserDto resultParserDto = new ResultParserDto();

        List<Map<String, String>> parserValueData = new ArrayList<>();
        Sheet sheet = null;
        try {
            sheet = book.getSheetAt(parserXlsVo.getSheetIndex());

        } catch (Exception e) {
            log.error(MessageUtil.getMessage("error.0002"), e);

        }
        if (sheet == null) {
            log.error(MessageUtil.getMessage("error.0002"));
            return resultParserDto;
        }
        if(CollectionUtils.isNotEmpty(parserXlsVo.getTitles())) {
            if (parserXlsVo.isRowOrColumn()) {
                //一列一列的解析
                parserValueData = parserXlsColList(book, sheet, parserXlsVo, callBack);
            } else {
                //一行一行的解析   默认一行一行的解析
                parserValueData = parserXlsRowList(book, sheet, parserXlsVo, callBack);
            }
        }
        resultParserDto.setId(parserXlsVo.getId());
        resultParserDto.setDatas(parserValueData);
        resultParserDto.setSpecialDatas(proccessSpecialValue(book, parserXlsVo.getSpecials()));
        return resultParserDto;
    }




    /**
     * 一行一行解析表格
     *
     * @param book
     * @param sheet
     * @param parserXlsVo
     * @return
     */
    private List<Map<String, String>> parserXlsRowList(Workbook book, Sheet sheet, ParserXlsVo parserXlsVo, CallBack callBack) {
        List<Map<String, String>> parserValueData = new ArrayList<>();
        for (int i = parserXlsVo.getStartIndex(); i < sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            if (isRowEmpty(row)) {
                continue;
            }
            Map<String, String> dataMap = new HashMap<String, String>();
            List<TitleVo> list = parserXlsVo.getTitles();
            if (CollectionUtils.isEmpty(list)) {
                log.error(MessageUtil.getMessage("error.0001", "传入标题"));
                return parserValueData;
            }
            for(int j=0;j<list.size();j++){
                TitleVo item=list.get(j);
                Cell cell = row.getCell(item.getValueIndex());
                String cellStr = getCellValue(book, cell);
                if(callBack!=null){
                    cellStr= callBack.callCellPre(dataMap,item.getKey(),cellStr);
                }
                dataMap.put(item.getKey(), cellStr);
            }
            if(callBack!=null){
               callBack.callLinePre(dataMap);
            }
            parserValueData.add(dataMap);

        }
        return parserValueData;
    }

    /**
     * 一列一列解析表格
     *
     * @param book
     * @param sheet
     * @param parserXlsVo
     * @return
     */
    private List<Map<String, String>> parserXlsColList(Workbook book, Sheet sheet, ParserXlsVo parserXlsVo, CallBack callBack) {
        List<Map<String, String>> parserValueData = new ArrayList<>();
        List<TitleVo> list = parserXlsVo.getTitles();
        if (CollectionUtils.isEmpty(list)) {
            log.error(MessageUtil.getMessage("error.0001", "传入标题"));
            return parserValueData;
        }
        int columnLength = getColumnLength(sheet);
        Map<String, String> dataMap = new HashMap<String, String>();
        for (int i = parserXlsVo.getStartIndex(); i < columnLength; i++) {
            for (int j = 0; j < list.size(); j++) {
                TitleVo item = list.get(j);
                Row row = sheet.getRow(item.getValueIndex());
                Cell cell = row.getCell(i);
                String cellStr = getCellValue(book, cell);
                if(callBack!=null){
                    cellStr= callBack.callCellPre(dataMap,item.getKey(),cellStr);
                }
                dataMap.put(item.getKey(), cellStr);
            }
            if(callBack!=null){
                callBack.callLinePre(dataMap);
            }
            if(dataMap!=null) {
                parserValueData.add(dataMap);
            }
        }
        return parserValueData;
    }


    private Map<String, List<String>> proccessSpecialValue(Workbook book, List<SpecialValueVo> specialValueVos) {

        Map<String, List<String>> specialValueDatas = new HashMap<>();
        for (SpecialValueVo specialValueVo : specialValueVos) {


            try {
                Sheet sheet = book.getSheetAt(specialValueVo.getSheetIndex());
                if(sheet==null){
                    continue;
                }
                Row row = sheet.getRow(specialValueVo.getRowIndex());
                if(row==null){
                    continue;
                }
                Cell cell = row.getCell(specialValueVo.getColIndex());
                if(cell==null){
                    continue;
                }
                String value = getCellValue(book, cell);
                List<String> values = specialValueDatas.get(specialValueVo.getKey());
                if (CollectionUtils.isEmpty(values)) {
                    values = new ArrayList<>();

                }
                values.add(value);
                specialValueDatas.put(specialValueVo.getKey(), values);
            } catch (Exception e) {
                log.error(e.getMessage(), e);
            }
        }
        return specialValueDatas;
    }

    /**
     * 获取这个页的最大列数
     *
     * @param sheet
     * @return
     */
    private int getColumnLength(Sheet sheet) {
        int maxLength = 0;
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            if (sheet.getRow(i).getPhysicalNumberOfCells() > maxLength) {
                maxLength = sheet.getRow(i).getPhysicalNumberOfCells();
            }
        }
        return maxLength;
    }

    private CellIndexDto isMergedRegion(Sheet sheet, int row, int column) {
        int sheetMergeCount = sheet.getNumMergedRegions();
        for (int i = 0; i < sheetMergeCount; i++) {
            CellRangeAddress range = sheet.getMergedRegion(i);
            int firstColumn = range.getFirstColumn();
            int lastColumn = range.getLastColumn();
            int firstRow = range.getFirstRow();
            int lastRow = range.getLastRow();
            if (row >= firstRow && row <= lastRow) {
                if (column >= firstColumn && column <= lastColumn) {
                    return new CellIndexDto(true, sheet, firstRow, lastRow, firstColumn, lastColumn);
                }
            }
        }
        return new CellIndexDto(false, sheet, row, row, column, column);
    }

    private boolean isRowEmpty(Row row) {
        if (row == null || row.getPhysicalNumberOfCells() < 1) {
            return true;
        }
        for (int c = row.getFirstCellNum(); c < row.getLastCellNum(); c++) {
            Cell cell = row.getCell(c);
            if (cell != null && cell.getCellType() != Cell.CELL_TYPE_BLANK)
                return false;
        }
        return true;
    }

    private String getCellValue(Workbook book, Cell cell) {

        String value = null;
        if (cell == null) {
            return "";
        }
        int cellType=cell.getCellType();
        if(cellType==Cell.CELL_TYPE_FORMULA){ //表达式类型
            FormulaEvaluator evaluator = book.getCreationHelper().createFormulaEvaluator();
            cellType=evaluator.evaluate(cell).getCellType();
        }
        switch (cellType) {

            case Cell.CELL_TYPE_NUMERIC:

                if (HSSFDateUtil.isCellDateFormatted(cell)) {
                    double d = cell.getNumericCellValue();
                    Date date = HSSFDateUtil.getJavaDate(d);
                    try {
                        value = com.guige.base.util.DateUtil.dateFormat(date, "yyyyMMdd");
                    } catch (Exception e) {
                        value = "";
                    }

                } else {
                    cell.setCellType(HSSFCell.CELL_TYPE_STRING);//无条件转为文本
                    value = cell.getStringCellValue();
//                        DecimalFormat formatCell = (DecimalFormat) NumberFormat.getPercentInstance();
//                        formatCell.applyPattern("######################################.##################################");
//                        double strCell = cell.getNumericCellValue();
//                        value = StringUtils.getRealStringValueOfDouble(strCell);
                }
                break;

            case Cell.CELL_TYPE_STRING:
                value = cell.getStringCellValue();
                break;

            case Cell.CELL_TYPE_BOOLEAN:
                value = cell.getBooleanCellValue() + "";
                break;
            default:
                value = cell.getStringCellValue() + "";
        }
        return value == null ? "" : value;
    }


    @Override
    public ResultParserDto parserXlsFile(jxl.Workbook book, ParserXlsVo parserXlsVo, CallBack call) {
        return null;
    }
}
