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
public class CreateServiceController {
	
	@GetMapping("/createService")
	public String createService(){		
		String mm="";
		Map<String, Object> root = new HashMap<String, Object>();
		//service 要素
		//包名packageName，引入的jar包importList，类名serviceName，自动注入类autowiredList
		//实现功能的方法methodList  , 列表方法需要 queryConditions
		root.put("packageName", "com.sdczzm.model");
		root.put("serviceName", "BookService");
		List<String> importList=new ArrayList<String>();
		importList.add("java.util.Date");
		root.put("importList", importList);
		List<String> autowiredList=new ArrayList<String>();
		autowiredList.add("BookService");
		root.put("autowiredList", autowiredList);
		List<Method> methodList=new ArrayList<Method>();	
		methodList.add(new Method("","书服务类","Book",MethodType.LIST_MAP));
		root.put("methodList", methodList);	
		List<QueryCondition> queryConditions=new ArrayList<QueryCondition>();
		QueryCondition qCondition = new QueryCondition();
		qCondition.setConditionName("书名");
		qCondition.setConditionCode("name");
		qCondition.setDataSource("book");
		qCondition.setDataCode("BOOK_NAME");
		qCondition.setConditionType(ConditionType.LIKE);
		qCondition.setDataType(DataType.STRING);
		queryConditions.add(qCondition);
		root.put("queryConditions", queryConditions);			
		try {
			mm=FreeMarkerUtils.createFileByTemplate(root, "/template/JSF/service", "JSF-service.ftl");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mm;
	}

}
