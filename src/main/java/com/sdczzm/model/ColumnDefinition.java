package com.sdczzm.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class ColumnDefinition {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String varcharType;
		
	private Double doubleType;
	
	private Date dateType;

}
