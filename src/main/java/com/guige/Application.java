package com.guige;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {JpaRepositoriesAutoConfiguration.class})
@ComponentScan(basePackages={"com"})
@EnableConfigurationProperties
@EnableAuthorizationServer
public class Application {

	public static void main(String[] args) {
		//AuthorizationServerConfigurer
		SpringApplication.run(Application.class, args);
	}



}
