package com.guige.parser.service.impl;

import com.alibaba.fastjson.JSON;
import com.guige.base.exception.BusinessException;
import com.guige.base.exception.vo.MessageVo;
import com.guige.base.util.ParserXlsUtil;
import com.guige.parser.entity.CompFundReport;
import com.guige.parser.mapper.CompFundReportMapper;
import com.guige.parser.model.vo.CompFundReportVo;
import com.guige.parser.service.CompFundReportService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import tk.mybatis.mapper.common.Mapper;

import java.io.File;
import java.io.IOException;

/**
 * 养老金实现
 *
 * @author Song.aw
 * @create 2017-11-10 8:30
 **/
@Service
public class CompFundReportServiceImpl implements CompFundReportService{
    @Autowired
    CompFundReportMapper compFundReportMapper;
    @Value("${parser.uploadPath}")
    String uploadPath;
    @Autowired
    ParserXlsUtil parserXlsUtil;
    @Override
    public MessageVo uploadReport(MultipartFile uploadfile) {
        try {

            String uuid = "test";

            File targetFile = new File(uploadPath +File.separator+ uuid);
            if(!targetFile.exists()){
                targetFile.mkdirs();
            }
            File dir = new File(uploadPath +File.separator+ uuid +File.separator+ uploadfile.getOriginalFilename());
            FileUtils.writeByteArrayToFile(dir, uploadfile.getBytes());
            System.out.println(uploadfile.getBytes().length);
            MessageVo<CompFundReportVo> messageVo= parserXlsUtil.parser(uploadfile.getOriginalFilename(),uploadfile.getBytes());
          if(CollectionUtils.isNotEmpty(messageVo.getData())){
              CompFundReportVo compFundReportVo = messageVo.getData().get(0);
              int result = saveReport(compFundReportVo);
                if(result==1){
                    messageVo.addInfoMessageObj("error.0004");
                }
          }
            return messageVo;
        }catch (IOException e){
            throw new BusinessException("error.0003",e);
        }

    }
    private int saveReport(CompFundReportVo compFundReportVo){
        //1.保存报告首页
        CompFundReport compFundReport = new CompFundReport();
        //insert(compFundReport);


        System.out.println(JSON.toJSONString(compFundReportVo));
        return 1;
    }
    @Override
    public Mapper getBaseMapper() {
        return compFundReportMapper;
    }
}
