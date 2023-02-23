package cn.lyj.middleware.hystrix;

import cn.lyj.middleware.hystrix.annotation.DoHystrix;
import cn.lyj.middleware.hystrix.value.impl.HystrixValveImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @program: midawller
 * @description:
 * @author: lyj
 * @create: 2023-02-23 19:25
 **/
@Aspect
@Component
public class DoHystrixPoint {

    @Pointcut("@annotation(cn.lyj.middleware.hystrix.annotation.DoHystrix)")
    public void aopPoint(){

    }

    @Around("aopPoint() && @annotation(doGovern)")
    public Object doRouter(ProceedingJoinPoint jp, DoHystrix doGovern) throws NoSuchMethodException {
        HystrixValveImpl valveService = new HystrixValveImpl();
        return valveService.access(jp,getMethod(jp),doGovern,jp.getArgs());
    }

    private Method getMethod(JoinPoint jp) throws NoSuchMethodException{
        Signature sig = jp.getSignature();
        MethodSignature methodSignature = (MethodSignature) sig;
        return jp.getTarget().getClass().getMethod(methodSignature.getName(),methodSignature.getParameterTypes());
    }
}
