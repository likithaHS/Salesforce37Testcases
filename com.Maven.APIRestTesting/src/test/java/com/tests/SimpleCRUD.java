package com.tests;

import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class SimpleCRUD {
	
	@BeforeClass
	public static void setUp() {
		RestAssured.baseURI="https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/";
	}
	
	public static String login() {
		Response res=	RestAssured
				.given()
				.body("{\"username\":\"likithahs@gmail.com\",\"password\":\"likithahs123\"}")
				.contentType(ContentType.JSON)
				.when()
				.post("login");
			res.then().statusCode(201);
			String token=res.jsonPath().get("[0].token");
			return token;
		
	}
	
	@Test(enabled = false)
	public static void loginToApi() {
	Response res=	RestAssured
		.given()
		.body("{\"username\":\"likithahs@gmail.com\",\"password\":\"likithahs123\"}")
		.contentType(ContentType.JSON)
		.when()
		.post("login");
	res.then().statusCode(201);
	String token=res.jsonPath().get("[0].token");
	String userid=res.jsonPath().get("[0].userid");
	System.out.println("token="+token);
	System.out.println("user id="+userid);
	res.prettyPrint();
		
	}
	
	@Test
	public static void getUser() {
		Header header = new Header("token", login());
	Response res= RestAssured.given().header(header)
		.when().get("getdata");
	res.then().statusCode(200);
	System.out.println("Number of records:"+res.jsonPath().get("size()"));
	System.out.println("First User id is :"+res.jsonPath().getString("[0].userid"));
	System.out.println("First id is :"+res.jsonPath().get("[0].id"));
	System.out.println("First Account no:"+res.jsonPath().getString("[0].accountno"));
	System.out.println("updated department no:"+res.jsonPath().get("[0].departmentno"));
	System.out.println("updated salary no:"+res.jsonPath().get("[0].salary"));
	 Map<String,?> VerifyDeleteAccount = res.path("find { it.accountno == \"TA-LTK2022\" }");
	 System.out.println("Deleted Account is :"+VerifyDeleteAccount);
	 res.then().body("find { it.accountno == \"TA-LTK2022\" }", Matchers.equalTo(null));
	
	}
	
	@Test(enabled = false)
	public static void createUser() {
		Header header = new Header("token", login());
	  Response res = RestAssured.given().header(header).contentType(ContentType.JSON)
		.body("{\"accountno\":\"TA-LTK2022\",\"departmentno\":\"2\",\"salary\":\"20000\",\"pincode\":\"123456\"}")
		.when().post("addData");
	  
	  
	  res.then().statusCode(201);
	  res.then().body("status", Matchers.equalTo("success"));
	}
	@Test(enabled = false)
	public static void updateUser() {
		
		Header header = new Header("token", login());
		  Response res = RestAssured.given().header(header).contentType(ContentType.JSON)
				  .body("{\"accountno\":\"TA-LTK2022\",\"departmentno\":1,\"salary\":50000,\"pincode\":123456,\"userid\":\"LojuRb6bN14xurmRubc2\",\"id\":\"9rHtMFA8E9rwA4boylYR\"}")
				  .when()
				  .put("updateData");
		  res.then().statusCode(200);
		  res.then().body("status", Matchers.equalTo("success"));
	}
	
	@Test(enabled= false)
	public static void deleteUser() {
		Header header = new Header("token", login());
		  Response res = RestAssured.given().header(header).contentType(ContentType.JSON)
				  .body("{\"id\":\"6rYvnPXtvXEnOUFgecbV\",\"userid\":\"LojuRb6bN14xurmRubc2\"}")
				  .when()
				  .delete("deleteData");
		  res.then().statusCode(200);
		  res.then().contentType(ContentType.JSON);
		  res.then().body("status", Matchers.equalTo("success"));
		  
	}

}
