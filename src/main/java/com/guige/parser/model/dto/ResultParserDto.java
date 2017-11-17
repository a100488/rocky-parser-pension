package com.guige.parser.model.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * 返回结果
 *
 * @author Song.aw
 * @create 2017-10-31 16:58
 **/
@Data
public class ResultParserDto {
    private int id;
    //特殊列解析
    Map<String,List<String>> specialDatas;
    //返回结果
    List<Map<String,String>> datas;
    
}
