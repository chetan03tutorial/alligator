package com.ps.fw.bdd.alligator.annotations.handler;

import com.ps.fw.bdd.alligator.annotations.HeaderParameter;
import com.ps.fw.bdd.alligator.lang.MethodParameter;
import com.ps.fw.bdd.alligator.web.request.ServiceRequest;

public class HeaderParameterHandler extends AbstractAnnotationHandler {

	@Override
	public void handle(ServiceRequest request,MethodParameter parameter) {
		HeaderParameter headerAnnotation = (HeaderParameter)parameter.getAnnotation(HeaderParameter.class);
		String paramValue = (String)parameter.getParamValue();		
		request.addHeaderParam(headerAnnotation.param(), paramValue);
	}
}
