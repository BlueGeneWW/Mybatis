package com.itheima.mybatis.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * 查询的注解
 */
@Retention(RetentionPolicy.RUNTIME)//改变注解的生命周期
@Target(ElementType.METHOD)//改变它出现的位置（出现在方法上）
public @interface Select {

    /**
     * 配置SQL语句的
     * @return
     */
    String value();
}
