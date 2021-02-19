package top.psiphonc.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {

    @Before("execution(* top.psiphonc.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("Before method execute");
    }

    @After("execution(* top.psiphonc.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("After method execute");
    }

    @Around("execution(* top.psiphonc.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Before around");
        final Object proceed = pjp.proceed();
        System.out.println("After around");
    }
}
