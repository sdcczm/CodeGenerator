package com.sdczzm.model;


/**
 * 查询条件  and user.name like '%a%'
 * @author QiHuifang
 *
 */
public class QueryCondition {
	
	//名称
	private String conditionName;
	
	//查询条件中用于传递的code
	private String conditionCode;
	
	//数据类型
	private DataType dataType;
	
	//数据查询时code，如列名、实体属性名
	private String dataCode;
	
	//< > = like
	private ConditionType conditionType; 
	
	//数据源
	private String dataSource ; 
	
	
	public String getConditionName() {
		return conditionName;
	}
	public void setConditionName(String conditionName) {
		this.conditionName = conditionName;
	}
	public String getConditionCode() {
		return conditionCode;
	}
	public void setConditionCode(String conditionCode) {
		this.conditionCode = conditionCode;
	}
	public String getDataSource() {
		return dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}
	public ConditionType getConditionType() {
		return conditionType;
	}
	public void setConditionType(ConditionType conditionType) {
		this.conditionType = conditionType;
	}
	public DataType getDataType() {
		return dataType;
	}
	public void setDataType(DataType dataType) {
		this.dataType = dataType;
	}
	public String getDataCode() {
		return dataCode;
	}
	public void setDataCode(String dataCode) {
		this.dataCode = dataCode;
	}
	
	
}
