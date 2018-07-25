package com.cloud.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class MemberFallBack implements FeginUser {


	public List<String> queryOrderUserAll() {
		List<String> list = new ArrayList<String>();
		list.add("服务发生异常...");
		return list;
	}

	public String sleep() {
		return "哎呀睡着了！";
	}

}
