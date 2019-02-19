package com.ps.fw.bdd.alligator.annotations.handler;

import com.ps.fw.bdd.alligator.lang.MethodParameter;
import com.ps.fw.bdd.alligator.web.request.ServiceRequest;

public interface AnnotationHandler {

	public void handle(ServiceRequest request, MethodParameter parameter);
}
