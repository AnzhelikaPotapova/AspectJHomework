package com.example.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ConstructorCallLoggingAspect {

    @Before("execution(com.example.model.Employee.new(..))")
    public void logEmployeeConstructorCall() {
        System.out.println("[ConstructorCallLoggingAspect] Создается объект Employee");
    }
}