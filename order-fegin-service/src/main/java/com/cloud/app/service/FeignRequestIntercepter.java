package com.cloud.app.service;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import feign.RequestInterceptor;
import feign.RequestTemplate;


@Component 
public class FeignRequestIntercepter implements RequestInterceptor { 
@Override 
public void apply(RequestTemplate requestTemplate) { 
//通过RequestContextHolder获取本地请求 
RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes(); 
if (requestAttributes == null){ 
return; 
} 
//获取本地线程绑定的请求对象 
HttpServletRequest request = ((ServletRequestAttributes)requestAttributes).getRequest(); 
//给请求模板附加本地线程头部信息，主要是cookie信息 
Enumeration headerNames = request.getHeaderNames(); 
while (headerNames.hasMoreElements()){ 
String name = (String) headerNames.nextElement(); 
requestTemplate.header(name,request.getHeader(name)); 
}

}

}
