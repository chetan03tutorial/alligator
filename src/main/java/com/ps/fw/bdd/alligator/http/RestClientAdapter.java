package com.ps.fw.bdd.alligator.http;

import com.jayway.restassured.response.Response;
import com.ps.fw.bdd.alligator.web.request.ServiceRequest;

public interface RestClientAdapter {
	
	public Response call(ServiceRequest requestWrapper) /*throws Exception*/;
	
}
