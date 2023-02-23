package cn.lyj.middleware.hystrix.value;

import cn.lyj.middleware.hystrix.annotation.DoHystrix;
import org.aspectj.lang.ProceedingJoinPoint;

import java.lang.reflect.Method;

/**
 * @program: midawller
 * @description:
 * @author: lyj
 * @create: 2023-02-23 19:23
 **/
public interface IValveService {

    Object access(ProceedingJoinPoint jp, Method method, DoHystrix doHystrix,Object[] args) throws Throwable;
}
