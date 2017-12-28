package com.sdczzm.controller;

public class EntityProperty {
	
	private String propertyName;
	
	private String columnName;
	
	private String dataType;

	public EntityProperty(String propertyName, String columnName, String dataType) {
		this.propertyName = propertyName;
		this.columnName = columnName;
		this.dataType = dataType;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
}
