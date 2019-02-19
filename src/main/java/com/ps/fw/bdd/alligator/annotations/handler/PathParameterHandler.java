package com.ps.fw.bdd.alligator.annotations.handler;

import com.ps.fw.bdd.alligator.annotations.PathParameter;
import com.ps.fw.bdd.alligator.lang.MethodParameter;
import com.ps.fw.bdd.alligator.util.DataHandlerUtil;
import com.ps.fw.bdd.alligator.web.request.ServiceRequest;

public class PathParameterHandler extends AbstractAnnotationHandler {

	@Override
	public void handle(ServiceRequest request,MethodParameter parameter) {
		
		PathParameter pathAnnotation = (PathParameter)parameter.getAnnotation(PathParameter.class);
		String requestData = DataHandlerUtil.dataHandler(pathAnnotation.dataHandler(),(String)parameter.getParamValue());		
		request.addPathParam(pathAnnotation.param(), requestData);
	}
}
