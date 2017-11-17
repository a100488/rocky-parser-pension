package com.guige.parser.model.vo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 解析表格类
 *
 * @author Song.aw
 * @create 2017-10-31 9:27
 **/
@Data
public class ParserXlsVo {
    private int id;//当解析多个时用来标识的
    private int sheetIndex=0;
    private int startIndex=0;//从第几行解析 or从第几列开始
    private List<TitleVo> titles;//标题
    /**
     * 行解析还是列解析  默认行解析
     */
    private  boolean rowOrColumn=false;
    /**
     * 向前向后  默认向后
     */
    private boolean nextOrPre=false;
    private List<SpecialValueVo> specials = new ArrayList<>();//特殊值解析




}
