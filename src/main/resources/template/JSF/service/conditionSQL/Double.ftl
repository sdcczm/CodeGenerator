
		if (ObjectUtils.isValidNumber((String) conditions.get("${condition.conditionCode}"))) {
			WHERE.append(" AND ${condition.dataSource}.${condition.dataCode} ${condition.conditionType.name} ? ");
		    params.add(Double.parseDouble(conditions.get("${condition.conditionCode}").toString()));  
		}