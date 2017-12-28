   
	    if (ObjectUtils.isNotNullString((String)conditions.get("${condition.conditionCode}"))) {
	    
			WHERE.append(" AND ${condition.dataSource}.${condition.dataCode} ${condition.conditionType.getName()} ? ");
		<#if condition.conditionType.getName() == 'like'>	
		    params.add("%"+(String)conditions.get("${condition.conditionCode}")+"%");
		<#else> 
		    params.add((String)conditions.get("${condition.conditionCode}"));   
		</#if>					
		}