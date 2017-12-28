package com.sdczzm.common;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.sdczzm.controller.norm.ResultBean;


@Component  
@Aspect
public class ControllerAOP {
	  private static final Logger logger = LogManager.getLogger(ControllerAOP.class);
	  
	  
	  @Around("execution(public com.sdczzm.controller.norm.ResultBean *(..))")  
	  public Object handlerControllerMethod(ProceedingJoinPoint pjp) {
	    long startTime = System.currentTimeMillis();
	    ResultBean<?> result;
	    try {
	      result = (ResultBean<?>) pjp.proceed();
	      logger.info(pjp.getSignature() + "use time:" + (System.currentTimeMillis() - startTime));
	    } catch (Throwable e) {
	      result = handlerException(pjp, e);
	    }
	    return result;
	  }
	  
	  
	  private ResultBean<?> handlerException(ProceedingJoinPoint pjp, Throwable e) {
	    ResultBean<?> result = new ResultBean();
	    // 已知异常
	    if (e instanceof CheckException) {
	      result.setMsg(e.getLocalizedMessage());
	      result.setCode(ResultBean.FAIL);
	      result.setFailCode(ResultBean.CHECK_EXCEPTION);
	    } else {
	      logger.error(pjp.getSignature() + " error ", e);
	      result.setMsg(e.toString());
	      result.setCode(ResultBean.FAIL);
	      result.setFailCode(ResultBean.UNKNOWN_EXCEPTION);
	     // 未知异常是应该重点关注的，这里可以做其他操作，如通知邮件，单独写到某个文件等等。
	    }
	    return result;
	  }	  
	}
