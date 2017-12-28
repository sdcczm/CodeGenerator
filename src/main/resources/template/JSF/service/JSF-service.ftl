package ${packageName};

import javax.ejb.Stateless;
import java.io.Serializable;
import javax.inject.Inject;
import com.wcs.base.service.EntityService;
<#list importList as import>
import ${import};
</#list>


@Stateless
public class ${serviceName} implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Inject
	private EntityService entityService;
  
	<#list autowiredList as autowired>
	private ${autowired} ${autowired?uncap_first};
	</#list>

	<#list methodList as method>
	 <#include method.methodType.getName()+".ftl"/> 
	</#list>

}

