package com.cloud.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class MemberFallBack implements FeginUser {


	public List<String> queryOrderUserAll() {
		List<String> list = new ArrayList<String>();
		list.add("�������쳣...");
		return list;
	}

	public String sleep() {
		return "��ѽ˯���ˣ�";
	}

}
