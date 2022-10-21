package com.tests;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class emplyoeeData {
	@Test
	public static void employees() {	
			File jsonArrayFile = new File(System.getProperty("user.dir")+"src/test/resources/employee.json");
			JsonPath jsonPath = JsonPath.from(jsonArrayFile);
			 System.out.println("Emplyoee name:"+jsonPath.getList("find{it.id == 7}.employee_name"));
	}
}
