package com.buyun.mall.security.auth.client.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName: IgnoreClientToken
 * @Description: 忽略服务鉴权
 * @Author hmily
 * @Date 2020/5/11 17:00
 * @Version: 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value={ElementType.METHOD,ElementType.TYPE})
public @interface IgnoreClientToken {

}
