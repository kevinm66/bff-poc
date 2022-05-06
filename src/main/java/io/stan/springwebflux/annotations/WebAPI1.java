package io.stan.springwebflux.annotations;

import org.springframework.context.annotation.Import;
import webapi.library.annotation.WebAPIType;
import webapi.library.filter.CustomRequestContextFilter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Import(CustomRequestContextFilter.class)
//@Import(WebApiAspect.class)
public @interface WebAPI1 {
    WebAPIType value();
}
