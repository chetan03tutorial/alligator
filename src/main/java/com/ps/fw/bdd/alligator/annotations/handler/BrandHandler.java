package com.ps.fw.bdd.alligator.annotations.handler;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.ps.fw.bdd.alligator.constants.Brand;
import com.ps.fw.bdd.alligator.exception.FrameworkException;
import com.ps.fw.bdd.alligator.exception.ResponseError;
import com.ps.fw.bdd.alligator.lang.MethodParameter;
import com.ps.fw.bdd.alligator.web.request.ServiceRequest;

public class BrandHandler extends AbstractAnnotationHandler {

	public void handle(ServiceRequest request, MethodParameter parameter) {
	    String brandEndpoint = getHostInformation((String) parameter.getParamValue());
	    if(StringUtils.isEmpty(brandEndpoint)){
	        throw new FrameworkException(new ResponseError("90001", "End point not configured for the brand"));
	    }
		String endpoint = new StringBuilder(brandEndpoint)
				.append(request.getEndPoint()).toString();
		request.setEndPoint(endpoint);
	}

	private String getHostInformation(String brandName) {
		Brand brand = Brand.valueOf(brandName.toUpperCase());
		switch (brand) {
		case BOS:
			return System.getProperty("endpoint.bos");//(String)applicationProperties.get());
		case HALIFAX:
			return System.getProperty("endpoint.halifax");//(String)applicationProperties.get("endpoint.halifax"));
		case LLOYDS:
			return System.getProperty("endpoint.lloyds");//(String)applicationProperties.get("endpoint.lloyds"));
		default:
			throw new IllegalArgumentException("Invalid brand " + brandName);
		}
	}


	
}
