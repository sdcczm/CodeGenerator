package com.sdczzm.model;

/**
 * 方法类型
 * @author QiHuifang
 *
 */
public enum MethodType {
	CREATE(1,"create","create{0}"),
	UPDATE(2,"update","update{0}"),
	LIST_MAP(3,"list-map","query{0}List"),
	LIST_ENTITY(4,"list-entity","query{0}List"),
	PAGE_MAP(5,"page-map","query{0}Page"),
	PAGE_ENTITY(6,"page-entity","query{0}Page"),
	JUDGE(7,"judge","{0}");

    private Integer value; 
	private String name;
	private String namingRules;
	
	/**
	 * 
	 * @param value
	 * @param name
	 * @param namingRules 命名规则
	 */
	private MethodType(Integer value, String name,String namingRules) {
		this.value = value;
		this.name = name;
		this.namingRules = namingRules;
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

	public String getNamingRules() {
		return namingRules;
	}

	public void setNamingRules(String namingRules) {
		this.namingRules = namingRules;
	}
	
	
	
}
