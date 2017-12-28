
      
    private Long ${property.propertyName};  

    @Column(name="${property.columnName}")
	public Long get${property.propertyName?cap_first}() {
		return ${property.propertyName};
	}

	public void set${property.propertyName?cap_first}(Long ${property.propertyName}) {
		this.${property.propertyName} = ${property.propertyName};
	}