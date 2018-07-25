package com.cloud.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserApiController {
	
	@Value("${server.port}")
	private String port;


	@RequestMapping("/queryUserAll")
	public List<String> queryUserAll(){
		List<String> list = new ArrayList<String>();
		list.add("小傻子");
		list.add("大傻子");
		list.add("这傻子");
		list.add(port);
		return list;
	}
	
	@RequestMapping("/get")
	public String get(HttpServletRequest request){
		HttpSession session = request.getSession(false);
		Object value = null;
		if(null != session) {
			value = session.getAttribute("name");
		}
		System.out.println("session:"+value);
		return "session:"+value;
	}
	
	@RequestMapping("/sleep")
	public String sleep(){
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "sleep";
	}
	
	
	
}
