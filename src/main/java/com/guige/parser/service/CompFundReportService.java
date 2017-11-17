package com.guige.parser.service;

import com.guige.base.exception.vo.MessageVo;
import com.guige.base.service.BaseService;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by songaw on 2017/11/9.
 */
public interface CompFundReportService extends BaseService {
    MessageVo uploadReport(MultipartFile uploadfile);
}
