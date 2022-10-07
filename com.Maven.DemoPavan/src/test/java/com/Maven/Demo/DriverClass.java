package com.Maven.Demo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class DriverClass {
	public static void main(String[] args) throws InterruptedException, IOException, FileNotFoundException {
		Launcher launcher = new Launcher();
		String propertyFileName = "C:\\Users\\likit\\eclipse-workspace\\com.Maven.Demo\\src\\test\\resources\\data.properties";
		PropertyReader property_reader = new PropertyReader(propertyFileName);
		launcher.login("firefox", property_reader);
	}
}