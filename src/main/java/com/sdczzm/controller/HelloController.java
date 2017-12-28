package com.sdczzm.controller;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdczzm.common.CheckException;
import com.sdczzm.controller.norm.ResultBean;



@RestController
public class HelloController {

	
	@GetMapping("/hello")
	public ResultBean<List<Map<String, Object>>> hello(){
		MDC.put("user", "sdczzm"); //log4j2记录日志时，记录下操作用户 %X{user}
		return new ResultBean<List<Map<String, Object>>> (test1());
	}
	
	public List<Map<String, Object>> test1() {
		test2();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("message", "happy new year!");
		map.put("year", "2018");
		list.add(map);
		return list;
	}
	
	public void test2() {
		test3();
	}
	
	public void test3() {
//		throw new CheckException("测试抛出异常");
		Integer im=Integer.parseInt("KK");
//		System.out.println("kkkkk");
	}
	
	@GetMapping("/mell")
	public String mell(){
		return "hello,kkkkk";
	}
	
}
