package cn.lyj.middleware.methodext.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: midawller
 * @description:
 * @author: lyj
 * @create: 2023-02-23 21:46
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoMethodExt {

    String method() default "";
    String returnJson() default "";

}
