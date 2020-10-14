package com.soft1851.contentcenter.auth;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author zhao
 * @className CheckAuthorization
 * @Description TODO
 * @Date 2020/10/13
 * @Version 1.0
 **/
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckAuthorization {
    String value();
}
