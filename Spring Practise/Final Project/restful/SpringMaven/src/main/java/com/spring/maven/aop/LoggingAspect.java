/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *
 * @author Faculty Pc
 */
@Aspect
@Component
public class LoggingAspect {
    
    @Pointcut("execution(public * getAll())")
    public void EmpServiceGetAll(){}
    
    @Before("EmpServiceGetAll()")
    public void beforeSave(JoinPoint jp, ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("Before called AOP");
        try {
            pjp.proceed();
        } catch (Exception e) {
        }
    }
    
    @After("EmpServiceGetAll()")
    public void afterSave(JoinPoint jp, ProceedingJoinPoint pjp){
        System.out.println("After called AOP");
    }
}
