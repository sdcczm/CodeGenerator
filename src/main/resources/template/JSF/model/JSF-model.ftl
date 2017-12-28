package ${packageName};

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
<#list importList as import>
import ${import};
</#list>


@Entity
@Table(name = "${tableName}")
public class ${entityName} {

<#list entityProperties as property>
 <#include property.dataType+".ftl"/> 
</#list>

}

