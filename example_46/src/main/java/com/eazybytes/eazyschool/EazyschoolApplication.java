package com.eazybytes.eazyschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.sql.DataSource;

//@SpringBootApplication(exclude = {AopAutoConfiguration.class, DataSourceAutoConfiguration.class})
@SpringBootApplication
@EnableFeignClients(basePackages = "com.eazybytes.eazyschool.proxy")
public class EazyschoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazyschoolApplication.class, args);
	}

}
