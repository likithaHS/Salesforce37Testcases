package com.test.test;

import java.lang.reflect.Method;
import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.test.POJO.DataPOJO;
import com.test.helpers.ReusableMethods;
import com.test.helpers.UserServiceHelpers;
import com.test.utility.GenerateReport;

import io.restassured.RestAssured;
import io.restassured.response.Response;

@Listeners(com.test.utility.ListenerClass.class)

public class TekArchApiTestScriptE2E extends UserServiceHelpers {

	@BeforeClass
	public static void setUp() {
		RestAssured.baseURI = getBaseuri();
	}

	@BeforeTest
	public static void setupBeforeTest() {
		report = GenerateReport.getInstance();
		report.startExtentReports();
	}

	@BeforeMethod
	public static void setUp(Method m) {
		report.startSingleTestReport(m.getName());
		report.logTestInfo("Before Method Start execution");
	}

	@AfterTest
	public static void teardownAfterTest() {
		report.endReport();
	}

	@Test
	public static void TC_001__getuserdata() {

		// getUserData();

		List<DataPOJO> listOfdata = getUserData();
		System.out.println("First user information in the userlist is :\n" + listOfdata.get(0));
		report.logTestInfo("First user information in the userlist is :\n" + listOfdata.get(0));
		report.logTestInfo("Get user data success");

	}

	@Test
	public static void TC_002_AddUserdata() {
		Response response = addUSerData();
		response.prettyPrint();
		report.logTestInfo("data been added successfully");
		ReusableMethods.verifyStatusCode(response, 200);
		ReusableMethods.verifyStatussuccess(response);
	}

	@Test
	public static void TC_003_deleteUserdataCreated() {
		Response response = deleteUserData();
		response.prettyPrint();
		report.logTestInfo("data been deleted successfully");
		ReusableMethods.verifyStatusCode(response, 200);
		ReusableMethods.verifyStatussuccess(response);
		ReusableMethods.verifydeletedID(response, addIdString);
		String message = ReusableMethods.getMessage(response);
		System.out.println("The message data in the Response body displayed is: " + message);
		report.logTestInfo("The message data in the Response body displayed is: " + message);
	}

	@Test
	public static void TC_004_deleteUserdata() {
		Response response = deleteUserData2();
		response.prettyPrint();
		report.logTestInfo("data been deleted successfully");
		ReusableMethods.verifyStatusCode(response, 400);
		ReusableMethods.verifyStatusError(response);
		String message = ReusableMethods.getMessage(response);
		System.out.println("The message data in the Response body displayed is: " + message);
		report.logTestInfo("The message data in the Response body displayed is: " + message);
	}

	@Test
	public static void TC_005__getuserdatabyID() {
		Response response = getUserDatabyID();
		ReusableMethods.verifyStatusCode(response, 200);
		ReusableMethods.verifyStatussuccess(response);
		ReusableMethods.contentType(response);
		report.logTestInfo("Employee data with id =2 is fetched sucussufully\n" + response.prettyPrint());
		System.out.println("Employee data with id =2 is fetched sucussufully" + response.prettyPrint());
	}

}
