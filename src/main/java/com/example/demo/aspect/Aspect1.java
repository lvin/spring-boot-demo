package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author wensen
 * @since 2018/10/11
 */
@Aspect
@Component
public class Aspect1 {

    @Pointcut("execution(public * com.example.demo.service.pa..*.*(..))")
    public void func(){}

    @After("func()")
    public void aspect1After(JoinPoint joinPoint) {
        System.out.println("aspect1 after=======================");
    }


    @AfterReturning(value = "func()")
    public void aspect1AfterReturning() {
        System.out.println("aspect1AfterReturning==============================");
    }

    @Before("func()")
    public void aspect1Before(JoinPoint joinPoint) {
        System.out.println("aspect1 before=======================");
    }

    @Around("func()")
    public void doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("aspect1 before around =================");
        joinPoint.proceed();
        System.out.println("aspect1 after around =================");
    }

    @AfterThrowing("func()")
    public void aspect1Afterthrowing() {
        System.out.println("aspect1 after throwing =======================");
    }

}
