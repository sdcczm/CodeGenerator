package com.sdczzm.controller.norm;

import java.io.Serializable;

import lombok.Data;

@Data
public class ResultBean<T> implements Serializable {
	
	  private static final long serialVersionUID = 1L;
	  public static final int SUCCESS = 0;
	  public static final int FAIL = 1;
	  public static final int NO_PERMISSION = 2;
	  public static final int CHECK_EXCEPTION = 1;
	  public static final int UNKNOWN_EXCEPTION = 2;
	  
	  private String msg = "success";
	  private int code = SUCCESS;
	  private int failCode = CHECK_EXCEPTION;
	  private T data;
	  
	  
	  public ResultBean() {
	    super();
	  }
	  
	  
	  public ResultBean(T data) {
	    super();
	    this.data = data;
	  }
	  
	  
	  public ResultBean(Throwable e) {
	    super();
	    this.msg = e.toString();
	    this.code = FAIL ;
	  }
	  
	  
	}
