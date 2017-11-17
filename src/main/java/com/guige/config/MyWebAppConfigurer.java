/*
package com.guige.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@Profile("dev")
public class MyWebAppConfigurer 
        extends WebMvcConfigurerAdapter {
*/
/**#默认配置的 */
/** 映射到 /static （或/public、/resources、/META-INF/resources）
     #优先级顺序为：META/resources > resources > static > public**//*

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //registry.addResourceHandler("*").addResourceLocations("classpath:templates/","classpath:/META-INF/resources/","classpath:/resources/","file:D://guige");
        registry.addResourceHandler("/static*/
/**").addResourceLocations("classpath:static/");
        super.addResourceHandlers(registry);
    }

}*/
