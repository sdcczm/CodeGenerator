   
    private String ${property.propertyName};  

    @Column(name="${property.columnName}")
	public String get${property.propertyName?cap_first}() {
		return ${property.propertyName};
	}

	public void set${property.propertyName?cap_first}(String ${property.propertyName}) {
		this.${property.propertyName} = ${property.propertyName};
	}