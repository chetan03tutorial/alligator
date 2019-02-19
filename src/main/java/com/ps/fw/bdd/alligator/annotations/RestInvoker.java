package com.ps.fw.bdd.alligator.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.ps.fw.bdd.alligator.constants.ContentType;
import com.ps.fw.bdd.alligator.web.request.HttpMethod;

@Retention(RetentionPolicy.RUNTIME)
public @interface RestInvoker {
	String service() ;
	HttpMethod method();
	ContentType contentType() default ContentType.JSON;
}
