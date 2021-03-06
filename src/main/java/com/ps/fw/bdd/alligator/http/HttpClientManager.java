package com.ps.fw.bdd.alligator.http;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jayway.restassured.response.Response;
import com.ps.fw.bdd.alligator.web.request.ServiceRequest;

@Component
public class HttpClientManager {

	@Autowired
	private RestClientAdapter restClientAdapter;
	
	public Response invoke(ServiceRequest request) /*throws Exception*/ 
	{
		return restClientAdapter.call(request);
	}
}
