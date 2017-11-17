package com.guige.parser.model.dto;

import org.apache.poi.ss.usermodel.Sheet;

/**
 * 值所在的位置
 *
 * @author Song.aw
 * @create 2017-10-31 15:29
 **/
public class CellIndexDto {
    private boolean merged;  //是否是合并行
    private Sheet sheet; //第几页
    private jxl.Sheet sheetJxl; //第几列
    private int startRow;    //跨行开始行
    private int endRow;      //跨行结束行
    private int startCol;    //跨列开始列
    private int endCol;      //跨列结束列
    public CellIndexDto(boolean merged,Sheet sheet, int startRow, int endRow
            , int startCol, int endCol) {
        this.sheet = sheet;
        this.merged = merged;
        this.startRow = startRow;
        this.endRow = endRow;
        this.startCol = startCol;
        this.endCol = endCol;
    }
    public CellIndexDto(boolean merged,jxl.Sheet sheetJxl, int startRow, int endRow
            , int startCol, int endCol) {
        this.sheetJxl = sheetJxl;
        this.merged = merged;
        this.startRow = startRow;
        this.endRow = endRow;
        this.startCol = startCol;
        this.endCol = endCol;
    }
}
