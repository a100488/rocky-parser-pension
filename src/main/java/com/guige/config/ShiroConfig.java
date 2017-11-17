/*
package com.guige.config;

import com.google.common.collect.Maps;
import com.yowits.security.config.BaseShiroConfig;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.Map;

@Configuration
public class ShiroConfig extends BaseShiroConfig {



	*/
/**
	 * @see org.apache.shiro.spring.web.ShiroFilterFactoryBean
	 * @return
	 *//*

	@Bean(name = "shiroFilter")
	public ShiroFilterFactoryBean shiroFilter(){
		ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
		bean.setSecurityManager(securityManager());

		Map<String, Filter>filters = Maps.newHashMap();
		bean.setFilters(filters);

		Map<String, String> chains = Maps.newHashMap();
		bean.setFilterChainDefinitionMap(chains);
		return bean;
	}

}*/
