package com.cloud.app.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(value = "USER-SERVICE",fallback=MemberFallBack.class)
public interface FeginUser {
	
	@RequestMapping("/queryUserAll")
	public List<String> queryOrderUserAll();
	
	@RequestMapping("/sleep")
	public String sleep();

}
