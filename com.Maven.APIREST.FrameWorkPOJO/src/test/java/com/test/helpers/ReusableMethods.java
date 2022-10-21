package com.test.helpers;

import org.hamcrest.Matchers;

import io.restassured.response.Response;

public class ReusableMethods {
	
	public static int getStatusCode(Response response) {
		return response.getStatusCode();
		
	}
	
	public static String contentType(Response response) {
		return response.getContentType();
		
	}
	
	public static void verifyStatusCode(Response response,int statusCode) {
		response.then().statusCode(statusCode);
		
	}
	
	public static void verifyStatussuccess(Response response) {
		response.then().body("status", Matchers.equalTo("success"));
		
	}


}
