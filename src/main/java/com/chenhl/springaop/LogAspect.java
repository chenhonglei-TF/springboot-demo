package com.chenhl.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @创建人: chenhl
 * @创建时间: 2020/9/4
 * @描述:
 */
@Aspect
@Component
public class LogAspect {

    // 切入com.example.demo下面的一级包下面的所有类的所有方法
//    @Before("execution(public * com.chenhl.springaop.HelloService.*(..))")
//    public void doBefore(JoinPoint joinPoint) {
//        System.out.println("doBefore run...");
//    }

    // 切入被@MyLog标注的方法
    @After("@annotation(myLog)")
    public void doAfter(JoinPoint joinPoint, MyLog myLog) {
        try {
            Object target = joinPoint.getTarget();

            System.out.println("doAfter run...");
        } catch (Throwable e) {
        } finally {
        }

    }

//    // 切入com.example.demo.service.DemoService类的所有方法中第一个参数为Serializable类型的方法
//    @AfterReturning(value = "execution(public * com.example.demo.service.DemoService.*(java.io.Serializable, ..))", returning = "result")
//    public void doAfterReturning(JoinPoint joinPoint, Object result) {
//        System.out.println("doAfterReturning run, result: " + result);
//    }
//
//    // 切入com.example.demo下所有的controller包下面的所有类的所有方法
//    @AfterThrowing(value = "execution(public * com.example.demo..controller.*(..))", throwing = "ex")
//    public void doAfterThrowing(JoinPoint joinPoint, Exception ex) {
//        System.out.println("doAfterThrowing catch exception: " + ex.getMessage());
//    }
//
//    // 切入com.example.demo.controller.DemoController的所有返回值为String的方法
//    @Around("execution(public String com.example.demo.controller.DemoController.*(..))")
//    public Object doAround(ProceedingJoinPoint joinPoint) {
//        System.out.println("doAround run...");
//        Object result = null;
//        try {
//            System.out.println("method before invoke...");
//            result = joinPoint.proceed();
//            System.out.println("method invoked, result: " + result);
//        } catch (Throwable throwable) {
//            System.out.println("method throws Exception: " + throwable.getMessage());
//            throwable.printStackTrace();
//        }
//        return result;
//    }

}
