package com.cloud.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.app.service.FeginUser;


@RestController
public class FeginController {

	@Autowired
	private FeginUser service;
	
	@RequestMapping("/queryOrderUserAll")
	public List<String> queryOrderUserAll(){
		return service.queryOrderUserAll();
	}
	
	@RequestMapping("/orderSleep")
	public String orderSleep(){
		return service.sleep();
	}
	
	@RequestMapping("/set")
	public String set(HttpServletRequest request){
		HttpSession session = request.getSession();
		session.setAttribute("name", "tooru2");
		return "session:"+(String) session.getAttribute("name");
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
}
