package cn.lyj.middleware.whitelist.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: midawller
 * @description:
 * @author: lyj
 * @create: 2023-02-22 21:43
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoWhiteList {

    String key() default "";

    String returnJson() default "";
}
