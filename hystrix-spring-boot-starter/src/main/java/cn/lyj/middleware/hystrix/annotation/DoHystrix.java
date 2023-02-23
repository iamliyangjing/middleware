package cn.lyj.middleware.hystrix.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: midawller
 * @description:
 * @author: lyj
 * @create: 2023-02-23 19:23
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoHystrix {

    String returnJson() default "";         // 失败结果 JSON
    int timeoutValue() default 0;           // 超时熔断

}
