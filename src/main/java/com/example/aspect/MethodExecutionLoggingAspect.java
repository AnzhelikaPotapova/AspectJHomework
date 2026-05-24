package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MethodExecutionLoggingAspect {

    @Before("execution(* com.example.service.CalculatorService.calculate(..))")
    public void logCalculateMethodExecution(JoinPoint joinPoint) {
        System.out.println("[MethodExecutionLoggingAspect] Вызван метод: "
                + joinPoint.getSignature().getName());
    }
}