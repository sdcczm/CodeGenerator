   
	    if ((Date)conditions.get("${condition.conditionCode}"))!=null) {
			WHERE.append(" AND ${condition.dataSource}.${condition.dataCode} ${condition.conditionType.name} ? ");
		    params.add((Date) conditions.get("${condition.conditionCode}"));   				
		}