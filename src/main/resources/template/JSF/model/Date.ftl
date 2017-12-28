
      
    private Date ${property.propertyName};  

    @Column(name="${property.columnName}")
	public Date get${property.propertyName?cap_first}() {
		return ${property.propertyName};
	}

	public void set${property.propertyName?cap_first}(Date ${property.propertyName}) {
		this.${property.propertyName} = ${property.propertyName};
	}