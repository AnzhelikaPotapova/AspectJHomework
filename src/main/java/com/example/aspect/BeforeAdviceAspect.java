package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BeforeAdviceAspect {

    @Before("execution(* com.example.service.CalculatorService.calculate(..))")
    public void beforeCalculate(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();

        System.out.println("[BeforeAdviceAspect] Перед calculate. Аргументы: "
                + args[0] + ", " + args[1]);
    }
}