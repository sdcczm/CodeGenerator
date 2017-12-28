   
    private Double ${property.propertyName};  

    @Column(name="${property.columnName}")
	public Double get${property.propertyName?cap_first}() {
		return ${property.propertyName};
	}

	public void set${property.propertyName?cap_first}(Double ${property.propertyName}) {
		this.${property.propertyName} = ${property.propertyName};
	}