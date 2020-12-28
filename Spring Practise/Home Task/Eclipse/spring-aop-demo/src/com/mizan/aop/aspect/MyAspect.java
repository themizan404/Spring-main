package com.mizan.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

	// this is where we add all of our related advices for logging
	// let's start with an @Before advice
	
	@Before("execution(public void com.mizan.aop.dao.AccountDAO.AddAccount())")
	public void beforeAdd() {
		
		System.out.println("\n======>>> Executing @Before advice on addAccount()<<<=============");
	}
}
