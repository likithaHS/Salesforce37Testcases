package com.tests;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.POJO.LoginRequestPOJO2;
import com.POJO.LoginResponsePOJO;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CRUDPOJO {
	
	@BeforeClass
	public static void setUp() {
		RestAssured.baseURI="https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/";
	}
	
	@Test
	public static void loginToApi() {
		LoginRequestPOJO2 logintoAPI= new LoginRequestPOJO2();
		logintoAPI.setUsername("likithahs@gmail.com");
		logintoAPI.setPassword("likithahs123");
		Response res=	RestAssured
			.given()
			.body(logintoAPI)
			.contentType(ContentType.JSON)
			.when()
			.post("login");
		
	 LoginResponsePOJO[] loginResponselist =  res.as(LoginResponsePOJO[].class);
	 String token1 = loginResponselist[0].getToken();
	 System.out.println("Token extracted using POJO object: "+token1);
	 res.prettyPrint();
		res.then().statusCode(201);
		String token=res.jsonPath().get("[0].token");
		String userid=res.jsonPath().get("[0].userid");
		System.out.println("token="+token);
		System.out.println("user id="+userid);
		res.prettyPrint();
			
		}

}
