package com.ps.fw.bdd.alligator.annotations.handler;

import com.ps.fw.bdd.alligator.annotations.MultipartParameter;
import com.ps.fw.bdd.alligator.lang.MethodParameter;
import com.ps.fw.bdd.alligator.util.AttachmentReader;
import com.ps.fw.bdd.alligator.web.request.ServiceRequest;

public class MultipartParameterHandler extends AbstractAnnotationHandler{

	@Override
	public void handle(ServiceRequest request, MethodParameter parameter) {
		MultipartParameter mpAnnotation = (MultipartParameter)parameter.getAnnotation(MultipartParameter.class);
		String filePath = (String)parameter.getParamValue();
		request.addMultipartParam(mpAnnotation.param(), AttachmentReader.readFile(filePath));
	}

}
