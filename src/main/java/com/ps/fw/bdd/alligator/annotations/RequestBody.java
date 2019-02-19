package com.ps.fw.bdd.alligator.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.ps.fw.bdd.alligator.core.RequestDataHandler;
import com.ps.fw.bdd.alligator.core.RequestDataHandler.DefaultDataHandler;
import com.ps.fw.bdd.alligator.web.request.LocalFileReader;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestBody {

	Class<?> reader() default LocalFileReader.class;

	Class<? extends RequestDataHandler> dataHandler() default DefaultDataHandler.class;
	
	boolean file() default false;

	/*
	 * static final class DefaultFormParameterDataHandler implements
	 * RequestDataHandler {
	 * 
	 * @Override public String doHandle(String data) { return data; } }
	 */

}
