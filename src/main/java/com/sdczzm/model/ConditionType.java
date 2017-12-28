package com.sdczzm.model;

/**
 * 查询条件类型
 * @author QiHuifang
 *
 */
public enum ConditionType {
	EQUAL(1,"="),
	LIKE(2,"like"),
	GT(3,">"),
	LT(4,"<");

    private Integer value; 
	private String name;
		
	private ConditionType(Integer value, String name) {
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
