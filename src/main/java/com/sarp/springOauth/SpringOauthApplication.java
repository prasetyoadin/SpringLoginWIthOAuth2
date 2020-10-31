package com.sarp.springOauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.sarp.springOauth.config.AppProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class SpringOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOauthApplication.class, args);
	}

}
