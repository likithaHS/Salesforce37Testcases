package com.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.response.Response;

public class FirstAPIRest {
	
	@Test
	public static void employees() {
	Response res=	RestAssured.given().when().get("https://dummy.restapiexample.com/api/v1/employees");
	 res.prettyPrint();
	 //status is success
	 String statusCode = res.jsonPath().getString("status");
	 System.out.println("Statuscode:"+statusCode);
	 res.then().body("status",Matchers.equalTo("success"));
	 
	 //find number of emeployee entries
	 int noofEmployee = res.jsonPath().get("data.size()");
	 System.out.println("noofEmployee:"+noofEmployee);
	 res.then().body("data.size()",Matchers.equalTo(24));
	 
	 //validate employee name=Herrod Chandler whose id is 7
	 String Emplyoeename = res.path("data.find{it.id == 7}.employee_name");
	System.out.println("Emplyoee name:"+Emplyoeename);
	res.then().body("data.find{it.id == 7}.employee_name",Matchers.equalTo("Herrod Chandler"));
	
	//extract all employee details whose salary is >300000
	 List<String> allEmplyoeeName = res.path("data.findAll { it.employee_age > 60 }.employee_name");
	System.out.println("List of all employee whose age is greater than 60\n"+allEmplyoeeName);
	 List<String> expectedStringValue= new ArrayList<String>();
	 expectedStringValue.add("Tiger Nixon");
	 expectedStringValue.add("Garrett Winters");
	 expectedStringValue.add("Ashton Cox");
	 expectedStringValue.add("Brielle Williamson");
	 expectedStringValue.add("Michael Silva");
	 	expectedStringValue.add("Paul Byrd");
	 System.out.println("List of expected employee whose age is greater than 60\n"+expectedStringValue);
	 res.then().body("data.findAll { it.employee_age > 60 }.employee_name",Matchers.equalTo(expectedStringValue));
	
	//extract employee names whose age is>60
	ArrayList<Map<String,?>> allEmployeesalary = res.path("data.findAll { it.employee_salary > 300000 }");
	System.out.println("All the emplyoee deatils whose salary is greater than 300000\n "+allEmployeesalary);
		
	}

}
