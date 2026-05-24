package com.example.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterThrowingAdviceAspect {

    @AfterThrowing(
            pointcut = "execution(* com.example.service.CalculatorService.divide(..))",
            throwing = "exception"
    )
    public void afterDivideException(Throwable exception) {
        System.out.println("[AfterThrowingAdviceAspect] Ошибка в методе divide: "
                + exception.getMessage());
    }
}