
      
    private Integer ${property.propertyName};  

    @Column(name="${property.columnName}")
	public Integer get${property.propertyName?cap_first}() {
		return ${property.propertyName};
	}

	public void set${property.propertyName?cap_first}(Integer ${property.propertyName}) {
		this.${property.propertyName} = ${property.propertyName};
	}