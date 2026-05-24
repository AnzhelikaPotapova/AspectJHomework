package com.example.aspect;

import org.aspectj.lang.JoinPoint;

public aspect MyAspect {

    pointcut calculateMethod():
            execution(* com.example.service.CalculatorService.calculate(..));

    before(): calculateMethod() {
        JoinPoint joinPoint = thisJoinPoint;

        System.out.println("[MyAspect без аннотаций] Перед вызовом метода: "
                + joinPoint.getSignature().getName());
    }
}