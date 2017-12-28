package com.sdczzm.controller;


import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdczzm.model.ConditionType;
import com.sdczzm.model.DataType;
import com.sdczzm.model.Method;
import com.sdczzm.model.MethodType;
import com.sdczzm.model.QueryCondition;
import com.sdczzm.template.common.FreeMarkerUtils;
import com.sun.org.apache.bcel.internal.generic.NEW;



@RestController
public class CreateTableController {
	
	@GetMapping("/createTable")
	public String createTable(){		
		String mm="";
		Map<String, Object> root = new HashMap<String, Object>();
		//表 要素
		//表名   列属性
		root.put("tableName", "USER");
		root.put("columns", "BookService");
		try {
			mm=FreeMarkerUtils.createFileByTemplate(root, "/template/JSF/service", "JSF-service.ftl");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mm;
	}

}
