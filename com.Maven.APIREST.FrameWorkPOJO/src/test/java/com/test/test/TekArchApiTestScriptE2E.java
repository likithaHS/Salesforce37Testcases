package com.test.test;

import java.lang.reflect.Method;
import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.utility.CommonUtilities;
import com.utility.GenerateReport;
import com.test.crud.pojo.GetUserdataPOJO;
import com.test.helpers.ReusableMethods;
import com.test.helpers.UserServiceHelpers;
import io.restassured.RestAssured;
import io.restassured.response.Response;

@Listeners(com.utility.ListenerClass.class)
public class TekArchApiTestScriptE2E extends UserServiceHelpers{
	
	@BeforeClass
	public static void setUp() {
		RestAssured.baseURI=getBaseuri();
	}
	
	@BeforeTest
	public static void setupBeforeTest() {
		report=GenerateReport.getInstance();
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
	
	@Test(enabled= true)
	public static void  TC_001_ValidLogin() {
		String token=getToken();
		System.out.println("token===="+token);
			
		}
	
	@AfterMethod
   public static void TC_002__getuserdata() {
	   
	   List<GetUserdataPOJO> listOfUsers=getUserData();
	   System.out.println("First user information in the userlist is :\n"+listOfUsers.get(0));
	   report.logTestInfo("First user information in the userlist is :\n"+listOfUsers.get(0));
	   
   }
	@Test(enabled = true)
	public static void TC_003_AddUserdata() {
		Response response= addUSerData();
		report.logTestInfo("data been added successfully");
		ReusableMethods.verifyStatusCode(response, 201);
		ReusableMethods.verifyStatussuccess(response);
		List<GetUserdataPOJO> listOfUsers=getUserData();
		 CommonUtilities cu = new CommonUtilities();
		 String ResponseIdValue = listOfUsers.get(0).getId();
		cu.setApplicationProperty("id", ResponseIdValue);
	}
	@Test(enabled = true)
	public static void TC_004_updateUserdata() {
		Response response= updateUserData();
		report.logTestInfo("data been updated successfully");
		ReusableMethods.verifyStatusCode(response, 200);
		ReusableMethods.verifyStatussuccess(response);
	}
	@Test(enabled = true)
	public static void TC_005_deleteUserdata() {
		Response response= deleteUserData();
		report.logTestInfo("data been deleted successfully");
		ReusableMethods.verifyStatusCode(response, 200);
		ReusableMethods.verifyStatussuccess(response);
	}

}
