package com.cloud.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EurekaApiController {

	@RequestMapping(value ="/query",produces = { "application/json;charset=UTF-8" })
	public List<String> queryUserAll(){
		List<String> list = new ArrayList<String>();
		list.add("小傻子");
		list.add("大傻子");
		list.add("这傻子");
		return list;
	}
	
}
