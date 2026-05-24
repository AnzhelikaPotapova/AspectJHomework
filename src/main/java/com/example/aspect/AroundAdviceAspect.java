package com.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AroundAdviceAspect {

    @Around("execution(* com.example.service.CalculatorService.calculate(..))")
    public Object measureCalculateExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.nanoTime();

        Object result = joinPoint.proceed();

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("[AroundAdviceAspect] Метод calculate выполнен за "
                + duration + " нс");

        return result;
    }
}