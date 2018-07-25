package com.cloud.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class TestController {

	@Value("${userName}")
	public String userName;
	
	@RequestMapping("/queryUserName")
	public String getUserName(){
		return userName;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TestController.class, args);
	}
}
