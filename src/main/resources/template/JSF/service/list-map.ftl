	/**
	 * ${method.memo}
	 * @param conditions
	 * @return
	 * @throws Exception
	 */
	public List<Map<String, Object>> ${method.name}(Map<String,Object> conditions) throws Exception{	
		String sql=${method.dataModel}Sql(conditions);
		List<Map<String, Object>> list=entityService.queryListByNativeSQL(sql,params.toArray());
		return list;
	}
	
	
	/**
	 * 查询SQL
	 * @param conditions
	 * @return
	 */
	private Map<String,Object> ${method.dataModel}Sql(Map<String,Object> conditions) throws Exception{	    
		Map<String,String> result=new HashMap<String, String>();
		Map<String,String> WHEREResult = ${method.dataModel}WhereSql();
		String WHERE =(String)WHEREResult.get("WHERE");	
		List<Object> params = (List) WHEREResult.get("params"); 
		StringBuilder FROM = new StringBuilder();
		result.put("params",params);
		return result;
	}
	
	
	
	/**
	 * 条件查询WHERESQL
	 * @param conditions
	 * @return
	 */
	private Map<String,Object> ${method.dataModel}WhereSql(Map<String,Object> conditions) throws Exception{
		List<Object> params=new ArrayList<Object>();
		StringBuilder WHERE = new StringBuilder();
		//查询条件
	  <#list queryConditions as condition>
	    // ${condition.conditionName}
	    <#include "conditionSQL/"+condition.dataType.getName()+".ftl"/> 
	  </#list>
	  
	    Map<String,String> result=new HashMap<String, String>();
		result.put("WHERE", WHERE.toString());
		result.put("params", params);
		return result;
	}
	