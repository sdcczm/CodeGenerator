package com.sdczzm.model;

/**
 * 数据类型--java
 * @author QiHuifang
 *
 */
public enum DataType {
	STRING(1,"String"),
	LONG(2,"Long"),
	INTEGER(3,"Integer"),
	DOUBLE(4,"Double"),
	DATE(5,"Date"),
	BOOLEAN(6,"Boolean");

    private Integer value; 
	private String name;
		
	private DataType(Integer value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
