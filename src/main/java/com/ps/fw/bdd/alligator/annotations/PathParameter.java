package com.ps.fw.bdd.alligator.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.ps.fw.bdd.alligator.core.RequestDataHandler;
import com.ps.fw.bdd.alligator.core.RequestDataHandler.DefaultDataHandler;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface PathParameter {
	String param();
	Class<? extends RequestDataHandler> dataHandler() default DefaultDataHandler.class;
}
