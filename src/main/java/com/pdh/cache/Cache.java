package com.pdh.cache;

import java.lang.annotation.*;

/**
 * @Author: 彭_德华
 * @Date: 2021-10-26 15:24
 * 自定义注解类Cache
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Cache {

    /**
     * 过期时间，默认60s
     * @return
     */
    long expire() default 2 * 60 * 1000;

    /**
     * 缓存标识name
     * @return
     */
    String name() default "";

}
