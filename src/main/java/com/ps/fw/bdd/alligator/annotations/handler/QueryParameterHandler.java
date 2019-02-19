package com.ps.fw.bdd.alligator.annotations.handler;

import com.ps.fw.bdd.alligator.annotations.QueryParameter;
import com.ps.fw.bdd.alligator.lang.MethodParameter;
import com.ps.fw.bdd.alligator.web.request.ServiceRequest;

public class QueryParameterHandler extends AbstractAnnotationHandler {

	@Override
	public void handle(ServiceRequest request,MethodParameter parameter) {
		QueryParameter queryParam = (QueryParameter)parameter.getAnnotation(QueryParameter.class);		
		request.addQueryParam(queryParam.param(), (String)parameter.getParamValue());
	}
}