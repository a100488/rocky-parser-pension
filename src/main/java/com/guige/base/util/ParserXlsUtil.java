package com.guige.base.util;

import com.alibaba.fastjson.JSON;
import com.guige.base.exception.BaseException;
import com.guige.base.exception.BusinessException;
import com.guige.base.exception.vo.MessageVo;
import com.guige.config.ParserConfigMap;
import com.guige.parser.entity.ReportAccount;
import com.guige.parser.entity.ReportBeEntrusted;
import com.guige.parser.model.dto.ResultParserDto;
import com.guige.parser.model.vo.CompFundReportSheetVo;
import com.guige.parser.model.vo.CompFundReportVo;
import com.guige.parser.service.ParserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

/**
 * TODO
 *
 * @author songaw
 * @date 2017/7/20 13:21
 */
@Slf4j
@Component
public class ParserXlsUtil {
    @Resource
    ParserService jxlParserXlsService;
    @Resource
    ParserService poiParserXlsService;

    final String NOT_RECOGNIZE_ITEM_CD = "99999999";// 科目代码

    @Autowired
    ParserConfigMap parserConfigMap;




    /* volatile Set<String> itemCdSet=new HashSet<>();*/
    public MessageVo parser(String fileName, byte[] fileDate) {

        MessageVo<CompFundReportVo> messageVo = new MessageVo<>();

        InputStream inputStream;
        InputStream inputStream2;
        try {
            inputStream = ByteToInputStream.byte2Input(fileDate);
            inputStream2 = ByteToInputStream.byte2Input(fileDate);
        } catch (Exception e) {
            
            log.error(e.getMessage());
            return messageVo.addErrorMessageObj("error.0014", "文件转换错误");

        }

        List<ResultParserDto> parserList = new ArrayList<>();

        CompFundReportVo compFundReportVo = new CompFundReportVo();
        compFundReportVo.setFilename(fileName);
        try {
            Workbook book= getPoiWorkbook(fileName,inputStream);
            if(CollectionUtils.isNotEmpty(parserConfigMap.getParserConfigList())){
                for(int i=0;i<parserConfigMap.getParserConfigList().size();i++){
                    ResultParserDto parserDto = poiParserXlsService.parserXlsFile(book,parserConfigMap.getParserConfigList().get(i));
                    parserList.add(parserDto);
                }
            }
        } catch (Exception e) {
            log.info("第一种方式解析失败，现用第二种方式", e);

          /*  try {
                jxl.Workbook book= getjxlWorkbook(fileName,inputStream);
                if(CollectionUtils.isNotEmpty(parserXlsVos)){
                    for(int i=0;i<parserXlsVos.size();i++){
                        ResultParserDto parserDto = jxlParserXlsService.parserXlsFile(book,parserXlsVos.get(i));
                        parserList.add(parserDto);
                    }
                }
            } catch (Exception e2) {
                log.error("第一种方式解析失败，现用第二种方式", e2);
                if (e2 instanceof BaseException) {
                    messageVo.addMessageVo(((BaseException) e2).getMessageList());
                } else {
                    messageVo.addErrorMessageObj("error.0014", "解析失败");
                }
            }*/
        }
        try {

            messageVo.replaceDataAddMessageVo(convert(parserList, compFundReportVo));

        } catch (BaseException e) {
            messageVo.addMessageVo(e.getMessageList());
        }
       /* if(CollectionUtils.isNotEmpty(itemCdSet)) {
            log.warn(JSON.toJSONString(itemCdSet));
        }*/
        return messageVo;
    }


    private jxl.Workbook getjxlWorkbook(String fileName,InputStream inputStream){
        jxl.Workbook book;
        ExecutorService threadPool = Executors.newCachedThreadPool();
        Future<jxl.Workbook> future = threadPool.submit(new Callable() {
            @Override
            public Object call() throws Exception {
                return jxl.Workbook.getWorkbook(inputStream);

            }
        });
        try {
            System.out.println("解析"+fileName);
            book = future.get(8, TimeUnit.SECONDS);

        }catch (TimeoutException e) {
            future.cancel(true);
            throw new BusinessException("error.0014", "解析时间过长 新版解析结束");
        } catch (Throwable e) {
            log.error("文件转换错误"+fileName, e);
            throw new BusinessException("error.0014", "运用老版解析文件转换错误");
        }finally {
            threadPool.shutdown();

        }
        return book;
    }
    private Workbook getPoiWorkbook(String fileName,InputStream inputStream){
        Workbook book=null;
        ExecutorService threadPool = Executors.newCachedThreadPool();
        Future<Workbook> future = threadPool.submit(new Callable() {
            @Override
            public Object call() throws Exception {
                if(isExcel2003(fileName)){
                    return new HSSFWorkbook(inputStream);
                }else {
                    return new XSSFWorkbook(inputStream);
                }

            }
        });
        try {
            System.out.println("解析"+fileName);
            book = future.get(8, TimeUnit.SECONDS);

        }catch (TimeoutException e) {
            future.cancel(true);
            throw new BusinessException("error.0014", "解析时间过长 新版解析结束");
        } catch (Throwable e) {
            log.error("文件转换错误"+fileName, e);
            throw new BusinessException("error.0014", "运用新版解析文件转换错误");
        }finally {
            threadPool.shutdown();

        }
        return book;
    }
    /**
     * @描述：是否是2003的excel，返回true是2003
     * @时间：2014-08-29 下午16:29:11
     * @参数：@param filePath　文件完整路径
     * @参数：@return
     * @返回值：boolean
     */
    private  boolean isExcel2003(String filePath) {
        return filePath.matches("^.+\\.(?i)(xls)$");
    }



    private MessageVo<CompFundReportVo> convert(List<ResultParserDto> resultParserDtos, CompFundReportVo compFundReportVo) {
        MessageVo<CompFundReportVo> messageVo = new MessageVo<>();
        List<CompFundReportVo> list = new ArrayList<>();//结果
        list.add(compFundReportVo);
        messageVo.setData(list);
        if(CollectionUtils.isNotEmpty(resultParserDtos)){
            resultParserDtos.stream().forEach(item->{

                switch (item.getId()){
                    case 1:
                        convertCompFundReport(item,compFundReportVo);
                        break;
                    case 2:
                        convertBeEntrusteds(item,compFundReportVo);
                        break;
                    case 3:
                        convertReportAccountss(item,compFundReportVo);
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;

                }

            });
        }


        return messageVo;
    }
    private void convertCompFundReport(ResultParserDto parserDto,CompFundReportVo compFundReportVo){
        Map<String,String> datas = new HashMap<>();
        Map<String,List<String>> specialDatas=parserDto.getSpecialDatas();
        StringBuilder stringBuilder =new StringBuilder();
        for (String key : specialDatas.keySet()) {
            if("date".equals(key)){
                List<String> list = specialDatas.get(key);
               if(CollectionUtils.isNotEmpty(list)){
                   try{

                    list.stream().forEach(item->stringBuilder.append(item));
                     //  date= DateUtil.dateParse(stringBuilder.toString(),"yyyy年MM月");
                   }catch (Exception e){
                        log.error("转换日期出错");
                   }
               }
               continue;
            }
           datas.put(key,specialDatas.get(key).get(0));
        }
        try{
           // org.apache.commons.beanutils.BeanUtils.populate(compFundReportVo,datas);
            String json = JSON.toJSONString(datas);
            CompFundReportVo compFundReport2=  JSON.parseObject(json,CompFundReportVo.class);
            compFundReport2.setCompFundReportSheets(compFundReportVo.getCompFundReportSheets());
            compFundReport2.setDate(stringBuilder.toString());
            BeanUtils.copyProperties(compFundReport2,compFundReportVo);
        }catch (Exception e){
            log.error("转换出错");
        }
    }
    private void convertBeEntrusteds(ResultParserDto parserDto,CompFundReportVo compFundReportVo){
        CompFundReportSheetVo compFundReportSheet = getCompFundReportSheetVo(parserDto, compFundReportVo);
        List<Map<String,String>> datas =parserDto.getDatas();
        List<ReportBeEntrusted> beEntrusteds = new ArrayList<>();

         if(CollectionUtils.isNotEmpty(datas)){
             datas.stream().forEach(item->{
                 ReportBeEntrusted reportBeEntrusted = new ReportBeEntrusted();
                 reportBeEntrusted.setProjectName(item.get("projectName"));


                 reportBeEntrusted.setPlanNum(getIntegerValue(item.get("planNum")));
                 reportBeEntrusted.setCompNum(getIntegerValue(item.get("compNum")));
                 reportBeEntrusted.setEmplNum(getIntegerValue(item.get("emplNum")));
                 reportBeEntrusted.setEntrustedFund(getBigDecimalValue(item.get("entrustedFund"),false));
                 reportBeEntrusted.setPensionAssets(getBigDecimalValue(item.get("pensionAssets"),false));
                 reportBeEntrusted.setTrusteeFee(getBigDecimalValue(item.get("trusteeFee"),false));
                /* try{
                 String json = JSON.toJSONString(item);
                 ReportBeEntrusted reportBeEntrusted =  JSON.parseObject(json,ReportBeEntrusted.class);

                  beEntrusteds.add(reportBeEntrusted);
             }catch (Exception e){
                 log.error("转换出错",e);
             }*/
                 beEntrusteds.add(reportBeEntrusted);
             });
         }
        compFundReportSheet.setBeEntrusteds(beEntrusteds);
    }
    private void convertReportAccountss(ResultParserDto parserDto,CompFundReportVo compFundReportVo){
        CompFundReportSheetVo compFundReportSheet = getCompFundReportSheetVo(parserDto, compFundReportVo);
        List<Map<String,String>> datas =parserDto.getDatas();
        List<ReportAccount> list = new ArrayList<>();

        if(CollectionUtils.isNotEmpty(datas)){
            datas.stream().forEach(item->{
                ReportAccount data = new ReportAccount();
                data.setProjectName(item.get("projectName"));
                data.setCompAccountNum(getIntegerValue(item.get("compAccountNum")));
                data.setPersionAccountNum(getIntegerValue(item.get("persionAccountNum")));
                data.setAccountBalanceNum(getIntegerValue(item.get("accountBalanceNum")));
                data.setAccountBalance(getBigDecimalValue(item.get("accountBalance"),false));
                data.setCurrentPayment(getBigDecimalValue(item.get("currentPayment"),false));
                data.setCurrentNewPayment(getBigDecimalValue(item.get("currentNewPayment"),false));
                data.setCurrentNewPayment(getBigDecimalValue(item.get("currentNewPayment"),false));
                data.setRecipientsOnce(getIntegerValue(item.get("recipientsOnce")));
                data.setRecipientsStages(getIntegerValue(item.get("recipientsStages")));
                data.setReceiveAmountOnce(getBigDecimalValue(item.get("receiveAmountOnce"),false));
                data.setReceiveAmountStages(getBigDecimalValue(item.get("receiveAmountStages"),false));
                data.setManageAccountFee(getBigDecimalValue(item.get("manageAccountFee"),false));
                /* try{
                 String json = JSON.toJSONString(item);
                 ReportBeEntrusted reportBeEntrusted =  JSON.parseObject(json,ReportBeEntrusted.class);

                  beEntrusteds.add(reportBeEntrusted);
             }catch (Exception e){
                 log.error("转换出错",e);
             }*/
                list.add(data);
            });
        }
        compFundReportSheet.setReportAccounts(list);


    }

    private CompFundReportSheetVo getCompFundReportSheetVo(ResultParserDto parserDto, CompFundReportVo compFundReportVo) {
        Map<String,String> datas = new HashMap<>();
        Map<String,List<String>> specialDatas=parserDto.getSpecialDatas();
        for (String key : specialDatas.keySet()) {
            datas.put(key,specialDatas.get(key).get(0));
        }
        CompFundReportSheetVo compFundReportSheet = new CompFundReportSheetVo();
        try{
            String json = JSON.toJSONString(datas);
            compFundReportSheet=  JSON.parseObject(json,CompFundReportSheetVo.class);

            //  org.apache.commons.beanutils.BeanUtils.populate(compFundReportSheet,datas);
            if(CollectionUtils.isEmpty(compFundReportVo.getCompFundReportSheets())){
                List<CompFundReportSheetVo> list = new ArrayList<>();
                compFundReportVo.setCompFundReportSheets(list);
            }
            compFundReportSheet.setReportType(parserDto.getId()+"");
            compFundReportVo.getCompFundReportSheets().add(compFundReportSheet);
        }catch (Exception e){
            log.error("转换出错",e);
        }
        return compFundReportSheet;
    }

    private int getIntegerValue(String value){
        int i=0;
        if(StringUtils.isNotBlank(value)){
            try {
                i=Integer.parseInt(value);
            }catch (Exception e){
                log.error("转换失败-值："+value,e);
            }
        }
        return i;
    }
    /**
     * 获取数值
     *
     * @param value      值
     * @param percentage 是否除以100  如果值里有%则此值忽略  直接除以100
     * @return
     */
    private BigDecimal getBigDecimalValue(String value, boolean percentage) {
        // boolean percentage=false;
        if (StringUtils.isBlank(value)) {
            return BigDecimal.ZERO;
        }
        if (StringUtils.isContainChinese(value)) {
            return BigDecimal.ZERO;
        }
        // if (value.contains("%")||(StringUtils.isNotBlank(title) && title.contains("%"))) {
        if (value.contains("%")) {
            percentage = true;
        }
        BigDecimal temp = BigDecimal.ZERO;
        try {

            value = value.replace(",", "").replace(" ", "").replace("%", "");
            value = StringUtils.replaceBlank(value);
            temp = new BigDecimal(value);
        } catch (Exception e) {
            log.error("BigDecimal转换错误" + value);
            return BigDecimal.ZERO;
        }
        if (percentage) {
            if (temp.compareTo(BigDecimal.ZERO) != 0) {
                temp = temp.divide(new BigDecimal("100"), 8, BigDecimal.ROUND_HALF_UP);
            }
        }
        return temp;
    }


}
