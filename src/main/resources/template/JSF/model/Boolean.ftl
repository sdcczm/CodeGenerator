   
    private Boolean ${property.propertyName};  

    @Column(name="${property.columnName}")
	public Boolean get${property.propertyName?cap_first}() {
		return ${property.propertyName};
	}

	public void set${property.propertyName?cap_first}(Boolean ${property.propertyName}) {
		this.${property.propertyName} = ${property.propertyName};
	}