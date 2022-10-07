package com.Maven.Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	public PropertyReader(String fileName) throws IOException, FileNotFoundException {
		inputFile = new FileInputStream(new File(fileName));
		properties = new Properties();
		properties.load(inputFile);
	}

	public String get(String key) throws IOException {
		return properties.getProperty(key);
	}

	private FileInputStream inputFile;
	private Properties properties;

}
