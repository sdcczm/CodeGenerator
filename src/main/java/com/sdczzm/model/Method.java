package com.sdczzm.model;


/**
 * 类中的方法
 * @author QiHuifang
 *
 */
@SuppressWarnings("rawtypes")
public class Method {
	
    private Class		clazz;
    private String		name; //方法名
    private String		memo; //方法说明
    //该方法操作的数据主体，可以是单表、多表、单实体、多实体，用于辅助生成方法名
    private String		dataModel;  
    private Class		returnType;
    private Class[]		parameterTypes;
    private MethodType  methodType; //方法类型
    
    
    
    
	public Method(String name, String memo, String dataModel,MethodType methodType) {
		this.name = name;
		this.memo = memo;
		this.dataModel = dataModel;
		this.methodType = methodType ;
	}
	
	public Class getClazz() {
		return clazz;
	}
	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public Class getReturnType() {
		return returnType;
	}
	public void setReturnType(Class returnType) {
		this.returnType = returnType;
	}
	
	public Class[] getParameterTypes() {
		return parameterTypes;
	}
	public void setParameterTypes(Class[] parameterTypes) {
		this.parameterTypes = parameterTypes;
	}
	
	public MethodType getMethodType() {
		return methodType;
	}
	public void setMethodType(MethodType methodType) {
		this.methodType = methodType;
	}
	public String getDataModel() {
		return dataModel;
	}
	public void setDataModel(String dataModel) {
		this.dataModel = dataModel;
	}	
}
