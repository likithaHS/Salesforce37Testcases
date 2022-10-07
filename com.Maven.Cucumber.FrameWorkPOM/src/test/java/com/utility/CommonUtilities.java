package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class CommonUtilities {
	public FileInputStream stream = null;

	public Properties loadFile(String filename) {
		Properties propertyFile = new Properties();
		String PropertyFilePath = null;
		switch (filename) {
		case "applicationProperties":
			PropertyFilePath = Constant.APPLICATION_PROPERTIES_PATH;
			break;
		case "applicationDataField":
			PropertyFilePath = Constant.APPLICATION_DATAFIELD_PATH;
			break;

		}

		try {
			stream = new FileInputStream(PropertyFilePath);
			propertyFile.load(stream);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return propertyFile;
	}

	public String getApplicationProperty(String key, Properties propertFile) {
		String value = propertFile.getProperty(key);
		System.out.println("Property we got from the file is :: " + value);
		try {
			stream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
}
