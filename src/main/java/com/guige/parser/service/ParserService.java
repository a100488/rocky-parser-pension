package com.guige.parser.service;

import org.apache.poi.ss.usermodel.Workbook;
import com.guige.parser.model.dto.*;
import com.guige.parser.model.vo.*;
/**
 * 解析service
 *
 * @author Song.aw
 * @create 2017-10-31 10:01
 **/
public interface ParserService {
    ResultParserDto parserXlsFile(Workbook book, ParserXlsVo parserXlsVo, CallBack call);
    default ResultParserDto parserXlsFile(Workbook book, ParserXlsVo parserXlsVo){
        return parserXlsFile(book,parserXlsVo,null);
    }

    ResultParserDto parserXlsFile(jxl.Workbook book, ParserXlsVo parserXlsVo, CallBack call);
    default ResultParserDto parserXlsFile(jxl.Workbook book, ParserXlsVo parserXlsVo){
        return parserXlsFile(book,parserXlsVo,null);
    }
}
