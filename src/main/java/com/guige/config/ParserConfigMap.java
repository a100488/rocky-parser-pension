package com.guige.config;

import com.guige.parser.model.vo.ParserXlsVo;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 解析config
 *
 * @author songaw
 * @date 2017/7/25 9:49
 */
@Data
@Component
@ConfigurationProperties(prefix="parser") //接收application.yml中的parser下面的属性
public class ParserConfigMap {

    List<ParserXlsVo> parserConfigList;

}
