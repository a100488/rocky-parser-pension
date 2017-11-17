package com.guige.parser.model.vo;

import lombok.Data;

@Data
public class SpecialValueVo {

    private String key; //key
    //所在地址
    private int sheetIndex=0;
    private int rowIndex=0;
    private int colIndex=0;
}