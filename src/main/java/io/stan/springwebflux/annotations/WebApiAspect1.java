package io.stan.springwebflux.annotations;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
//@Import(CustomRequestContextFilter.class)
public class WebApiAspect1 {
    @Before(value = " @annotation(io.stan.springwebflux.annotations.WebAPI1)")
    public void intercept (JoinPoint joinPoint) throws Throwable {
        System.out.println("Aspect1 executed");
        System.out.println("Method name: "+joinPoint.toString());
      //  return joinPoint.proceed();
    }
}
