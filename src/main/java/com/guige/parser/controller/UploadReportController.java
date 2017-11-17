package com.guige.parser.controller;

import com.guige.base.exception.vo.MessageVo;
import com.guige.parser.service.CompFundReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 上传报告controller
 *
 * @author Song.aw
 * @create 2017-11-09 11:25
 **/
@RestController
@RequestMapping(value = "/v1/upload")
public class UploadReportController {
   @Autowired
    CompFundReportService compFundReportService;
    @RequestMapping(value = "/xls", method = RequestMethod.POST)
    public MessageVo uploadXlsFile(MultipartFile uploadfile) {
       return compFundReportService.uploadReport(uploadfile);

    }
}
