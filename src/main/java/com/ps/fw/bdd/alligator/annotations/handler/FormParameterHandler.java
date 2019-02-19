package com.ps.fw.bdd.alligator.annotations.handler;

import com.ps.fw.bdd.alligator.annotations.FormParameter;
import com.ps.fw.bdd.alligator.lang.MethodParameter;
import com.ps.fw.bdd.alligator.web.request.ServiceRequest;

public class FormParameterHandler extends AbstractAnnotationHandler {

	
	public void handle(ServiceRequest request, MethodParameter parameter) {
		FormParameter formParameter = (FormParameter) parameter.getAnnotation(FormParameter.class);
		String paramName = formParameter.param();
		Object paramValue = parameter.getParamValue();
		request.addFormParam(paramName, (String)paramValue);
		
		
		
		//Class<?> readerClass = formParameter.reader();
		
		
		//String requestData = readRequest(readerClass, (String) parameter.getParamValue());
		//requestData = DataHandlerUtil.dataHandler(formParameter.dataHandler(), requestData);
		//request.setRequestBody(requestData);
	}

	/*private String readRequest(Class<?> readerClass, String resourceName) {
		RequestReader reader = null;
		if (!RequestReader.class.isAssignableFrom(readerClass)) {
			// throw an exception for illegal request reader
		}
		reader = readerMap.get(readerClass);
		return reader.readRequest(resourceName);
	}*/
}
