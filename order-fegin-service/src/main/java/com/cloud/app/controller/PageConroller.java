package com.cloud.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageConroller {
	
	@RequestMapping("/goindex")
	public String index(){
		return "/index";
	}

}
