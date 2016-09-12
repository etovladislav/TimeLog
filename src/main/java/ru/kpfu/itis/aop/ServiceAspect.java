package ru.kpfu.itis.aop;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

/**
 * Created by etovladislav on 12.09.16.
 */
public class ServiceAspect {
    public Object timeLog(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("Start invoking "
                + joinPoint.getTarget().getClass().getSimpleName()
                + "."
                + joinPoint.getSignature().getName()
                + " with params "
                + Arrays.toString(joinPoint.getArgs()));
        Object result = joinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println("End invoking method: " + (end - start) + "ms");
        return result;
    }
}
