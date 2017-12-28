package com.sdczzm.controller;


import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdczzm.template.common.FreeMarkerUtils;



@RestController
public class CreateModelController {
	
	@GetMapping("/createModel")
	public String createModel(){		
		String mm="";
		Map<String, Object> root = new HashMap<String, Object>();
		//model 要素
		//包名packageName，引入的jar包importList，
		//实体对应的表名tableName，实体名entityName ，实体属性 entityProperties
		root.put("packageName", "com.sdczzm.model");
		root.put("tableName", "BOOK");
		root.put("entityName", "Book");
		List<String> importList=new ArrayList<String>();
		importList.add("java.util.Date");
		root.put("importList", importList);
		List<EntityProperty> entityProperties=new ArrayList<EntityProperty>();
		entityProperties.add(new EntityProperty("name","NAME","String"));
		entityProperties.add(new EntityProperty("publicationDate","PUBLICATION_DATE","Date"));
		root.put("entityProperties", entityProperties);	
		try {
			mm=FreeMarkerUtils.createFileByTemplate(root, "/template/JSF/model", "JSF-model.ftl");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mm;
	}

}
