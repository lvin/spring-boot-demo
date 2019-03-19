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
public class Aspect2 {

    @Pointcut("execution(public * com.example.demo.service.pa..*.*(..))")
    public void func(){}

    @After("func()")
    public void aspect2After(JoinPoint joinPoint) {
        System.out.println("aspect2 after=======================");
    }

    @Before("func()")
    public void aspect2Before(JoinPoint joinPoint) {
        System.out.println("aspect2 before=======================");
    }

    @Around("func()")
    public void doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("aspect2 before around =================");
        joinPoint.proceed();
        System.out.println("aspect2 after around =================");
    }


}
