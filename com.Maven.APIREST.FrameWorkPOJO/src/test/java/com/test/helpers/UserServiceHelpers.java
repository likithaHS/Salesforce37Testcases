package com.test.helpers;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import com.test.crud.pojo.AddUserPOJO;
import com.test.crud.pojo.DeleteUserPOJO;
import com.test.crud.pojo.GetUserdataPOJO;
import com.test.crud.pojo.LoginRequest;
import com.test.crud.pojo.LoginResponsePOJO;
import com.test.crud.pojo.UpdateUserPOJO;
import com.utility.CommonUtilities;
import com.utility.EndPoints;
import com.utility.GenerateReport;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;


public class UserServiceHelpers {
	private static Response response;
	private static String token;
	public static GenerateReport report = null;
	
	public static String getBaseuri() {
		CommonUtilities cu = new CommonUtilities();
    	Properties applicationPropertiesFile=cu.loadFile("applicationProperties");
		String BaseURL =cu.getApplicationProperty("url", applicationPropertiesFile);
		//String BaseURL="https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/";
		//Assert.assertEquals(BaseURL, propertyURL);
		//System.out.println("BaseURL"+BaseURL);
		return BaseURL;
	}
	
	public static Response loginToApi() {
		CommonUtilities cu = new CommonUtilities();
    	Properties applicationPropertiesFile=cu.loadFile("applicationProperties");
		LoginRequest logintoAPI= new LoginRequest();
		logintoAPI.setUsername(cu.getApplicationProperty("vaild_username", applicationPropertiesFile));
		logintoAPI.setPassword(cu.getApplicationProperty("valid_Password", applicationPropertiesFile));
		response =	RestAssured
			.given()
			.body(logintoAPI)
			.contentType(ContentType.JSON)
			.when()
			.post(EndPoints.LOGIN);
		report.logTestInfo("Login to tekarch succuss");
		return response;
	}
		
		public static String getToken() {
			response=loginToApi();
			LoginResponsePOJO[] loginResponselist = response.as(LoginResponsePOJO[].class);
			 token = loginResponselist[0].getToken();
			//token=response.jsonPath().getString("[0].token");
			 response.prettyPrint();
			 report.logTestInfo("Token fetch is succuss:\n"+token);
			return token;
			
		}
		
		public static List<GetUserdataPOJO> getUserData() {
			Header header = new Header("token", token);
		response= RestAssured.given().header(header)
				.when().get(EndPoints.GET_DATA);
			GetUserdataPOJO[] getUserArray =response.as(GetUserdataPOJO[].class);
			List<GetUserdataPOJO> GetallUsers= Arrays.asList(getUserArray);
			response.then().statusCode(200);
			System.out.println("Total number of users extracted from getUserdata is "+response.jsonPath().get("size()"));
			return GetallUsers;
			
		}
		
		public static Response addUSerData() {
			CommonUtilities cu = new CommonUtilities();
	    	Properties applicationPropertiesFile=cu.loadFile("applicationProperties");
			Header header = new Header("token", token);
			AddUserPOJO adduser = new AddUserPOJO();
			adduser.setAccountno(cu.getApplicationProperty("accountno", applicationPropertiesFile));
			adduser.setDepartmentno(cu.getApplicationProperty("departmentno", applicationPropertiesFile));
			adduser.setSalary(cu.getApplicationProperty("salary", applicationPropertiesFile));
			adduser.setPincode(cu.getApplicationProperty("pincode", applicationPropertiesFile));
			
		response= RestAssured.given().header(header).contentType(ContentType.JSON)
				.body(adduser)
				.when().post(EndPoints.ADD_DATA);
			/*GetUserdataPOJO[] getUserArray =response.as(GetUserdataPOJO[].class);
			List<GetUserdataPOJO> GetallUsers= Arrays.asList(getUserArray);
			//response.then().statusCode(200);
			System.out.println("Total number of users extracted from getUserdata is "+response.jsonPath().get("size()"));*/
			return response;
			
		}
		
		public static Response updateUserData() {
			CommonUtilities cu = new CommonUtilities();
	    	Properties applicationPropertiesFile=cu.loadFile("applicationProperties");
			Header header = new Header("token", token);
			UpdateUserPOJO updateuser = new UpdateUserPOJO();
			updateuser.setAccountno(cu.getApplicationProperty("accountno", applicationPropertiesFile));
			updateuser.setDepartmentno(cu.getApplicationProperty("updateddepartmentno", applicationPropertiesFile));
			updateuser.setSalary(cu.getApplicationProperty("updatedsalary", applicationPropertiesFile));
			updateuser.setPincode(cu.getApplicationProperty("pincode", applicationPropertiesFile));
			updateuser.setUserid(cu.getApplicationProperty("userid", applicationPropertiesFile));
			updateuser.setId(cu.getApplicationProperty("id", applicationPropertiesFile));
			response= RestAssured.given().header(header).contentType(ContentType.JSON)
					.body(updateuser)
					.when().put(EndPoints.UPDATE_DATA);
			return response;
			
			
		}
		
		public static Response deleteUserData() {
			
			CommonUtilities cu = new CommonUtilities();
	    	Properties applicationPropertiesFile=cu.loadFile("applicationProperties");
			Header header = new Header("token", token);
			DeleteUserPOJO deleteuser = new DeleteUserPOJO();
			deleteuser.setUserid(cu.getApplicationProperty("userid", applicationPropertiesFile));
			deleteuser.setId(cu.getApplicationProperty("id", applicationPropertiesFile));
			response= RestAssured.given().header(header).contentType(ContentType.JSON)
					.body(deleteuser)
					.when().delete(EndPoints.DELETE_DATA);
			return response;
		}


}

