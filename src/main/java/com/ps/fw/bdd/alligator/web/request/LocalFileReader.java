package com.ps.fw.bdd.alligator.web.request;

import java.io.IOException;
import java.io.InputStream;

import com.ps.fw.bdd.alligator.util.FileUtil;
import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LocalFileReader implements RequestReader {

	protected final Log logger = LogFactory.getLog(getClass());
	
	public LocalFileReader(){
	    System.out.println("Jai Ganesh, Inside Local File Reader");
	}
	public String readRequest(String fileName) {
		String filePath = fileName + ".json";
		logger.debug("===file path is ====" + filePath);
		InputStream inputStream = FileUtil.loadFile(filePath);
		logger.debug("===Got file === " + filePath);
		String theString = null;
		try {
			theString = IOUtils.toString(inputStream, "UTF-8");
		} catch (IOException e) {
			logger.debug("unable to read the json request file from the path "+ filePath);
			logger.debug("unable to read the json request file from the path "+ e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				logger.debug("unable to close the input stream to "+ filePath);
				e.printStackTrace();
			}

		}
		logger.debug("file content is " + theString);
		return theString;
	}

}
