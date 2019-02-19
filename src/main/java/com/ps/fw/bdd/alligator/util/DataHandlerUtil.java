package com.ps.fw.bdd.alligator.util;

import com.ps.fw.bdd.alligator.core.RequestDataHandler;

public class DataHandlerUtil {

	public static String dataHandler(Class<?> dataHandlerClass, String data) {
		RequestDataHandler dataHandler = null;
		String requestData = null;
		if (RequestDataHandler.class.isAssignableFrom(dataHandlerClass)) {
			try {
				dataHandler = (RequestDataHandler) dataHandlerClass.newInstance();
				requestData = dataHandler.doHandle(data);
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch(IllegalAccessException  e) {
				e.printStackTrace();
			}
		}
		return requestData;
	}

}
