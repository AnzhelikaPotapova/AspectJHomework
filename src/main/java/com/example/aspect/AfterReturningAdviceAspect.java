package com.example.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterReturningAdviceAspect {

    @AfterReturning(
            pointcut = "execution(* com.example.model.Employee.getName())",
            returning = "employeeName"
    )
    public void afterEmployeeNameReturned(String employeeName) {
        System.out.println("[AfterReturningAdviceAspect] Метод getName вернул: "
                + employeeName);
    }
}