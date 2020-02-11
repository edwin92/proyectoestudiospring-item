package com.apisew.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient( name = "api-productos" )
@EnableFeignClients
@SpringBootApplication
public class ApiItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiItemApplication.class, args);
	}

}
