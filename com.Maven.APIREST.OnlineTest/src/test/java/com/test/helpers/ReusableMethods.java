package com.test.helpers;

import org.hamcrest.Matchers;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ReusableMethods {

	public static int getStatusCode(Response response) {
		return response.getStatusCode();

	}

	public static void contentType(Response response) {
		 response.then().contentType(ContentType.JSON);

	}

	public static void verifyStatusCode(Response response, int statusCode) {
		response.then().statusCode(statusCode);

	}

	public static void verifyStatussuccess(Response response) {
		response.then().body("status", Matchers.equalTo("success"));

	}

	public static void verifyStatusError(Response response) {
		response.then().body("status", Matchers.equalTo("error"));

	}

	public static String getMessage(Response response) {
		String message = response.jsonPath().getString("message");
		return message;
	}

	public static void verifydeletedID(Response response, String id) {
		response.then().body("data", Matchers.equalTo(id));

	}

}
