package com.Maven.Demo;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
 public static String readPropertyData(String key) throws IOException {
	 FileInputStream inputFile = new FileInputStream(new File("C:\\Users\\likit\\eclipse-workspace\\com.Maven.Demo\\src\\test\\resources\\data.properties"));
	 Properties ob = new Properties();
	 ob.load(inputFile);
	 String value = ob.getProperty(key);
	 return value;
	 
	 
 }
}
