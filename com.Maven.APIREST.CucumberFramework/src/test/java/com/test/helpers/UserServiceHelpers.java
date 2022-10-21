package com.test.helpers;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import com.test.crud.pojo.AddUserDataPOJO;
import com.test.crud.pojo.DeleteUserDataPOJO;
import com.test.crud.pojo.GetUserDataPOJO;
import com.test.crud.pojo.LoginRequestPOJO;
import com.test.crud.pojo.LoginResponsePOJO;
import com.test.crud.pojo.UpdateUserDataPOJO;
import com.utility.CommonUtilities;
import com.utility.EndPoints;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class UserServiceHelpers {
	public static Response response;
	public static String token;
	public static LoginRequestPOJO logintoAPI;

	
	public static String getBaseuri() {
		CommonUtilities cu = new CommonUtilities();
    	Properties applicationPropertiesFile=cu.loadFile("applicationProperties");
		String BaseURL =cu.getApplicationProperty("url", applicationPropertiesFile);
		//String BaseURL="https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/";
		//Assert.assertEquals(BaseURL, propertyURL);
		//System.out.println("BaseURL"+BaseURL);
		return BaseURL;
	}
	
	public static void userPassword() {
		CommonUtilities cu = new CommonUtilities();
    	Properties applicationPropertiesFile=cu.loadFile("applicationProperties");
		logintoAPI= new LoginRequestPOJO();
		logintoAPI.setUsername(cu.getApplicationProperty("vaild_username", applicationPropertiesFile));
		logintoAPI.setPassword(cu.getApplicationProperty("valid_Password", applicationPropertiesFile));
		
	}
	
	public static Response loginToApi() {
		
		response =	RestAssured
			.given()
			.body(logintoAPI)
			.contentType(ContentType.JSON)
			.when()
			.post(EndPoints.LOGIN);
		return response;
	}
		
		public static String getToken() {
			LoginResponsePOJO[] loginResponselist = response.as(LoginResponsePOJO[].class);
			 token = loginResponselist[0].getToken();
			//token=response.jsonPath().getString("[0].token");
			 response.prettyPrint();
			return token;
			
		}
		
		public static List<GetUserDataPOJO> getUserData() {
			Header header = new Header("token", token);
		response= RestAssured.given().header(header)
				.when().get(EndPoints.GET_DATA);
			GetUserDataPOJO[] getUserArray =response.as(GetUserDataPOJO[].class);
			List<GetUserDataPOJO> GetallUsers= Arrays.asList(getUserArray);
			response.then().statusCode(200);
			System.out.println("Total number of users extracted from getUserdata is "+response.jsonPath().get("size()"));
			return GetallUsers;
			
		}
		
		public static Response addUSerData() {
			CommonUtilities cu = new CommonUtilities();
	    	Properties applicationPropertiesFile=cu.loadFile("applicationProperties");
			Header header = new Header("token", token);
			AddUserDataPOJO adduser = new AddUserDataPOJO();
			adduser.setAccountno(cu.getApplicationProperty("accountno", applicationPropertiesFile));
			adduser.setDepartmentno(cu.getApplicationProperty("departmentno", applicationPropertiesFile));
			adduser.setSalary(cu.getApplicationProperty("salary", applicationPropertiesFile));
			adduser.setPincode(cu.getApplicationProperty("pincode", applicationPropertiesFile));
			
		response= RestAssured.given().header(header).contentType(ContentType.JSON)
				.body(adduser)
				.when().post(EndPoints.ADD_DATA);
			/*GetUserDataPOJO[] getUserArray =response.as(GetUserDataPOJO[].class);
			List<GetUserDataPOJO> GetallUsers= Arrays.asList(getUserArray);
			//response.then().statusCode(200);
			System.out.println("Total number of users extracted from getUserdata is "+response.jsonPath().get("size()"));*/
			return response;
			
		}
		
		public static Response updateUserData() {
			CommonUtilities cu = new CommonUtilities();
	    	Properties applicationPropertiesFile=cu.loadFile("applicationProperties");
			Header header = new Header("token", token);
			UpdateUserDataPOJO updateuser = new UpdateUserDataPOJO();
			updateuser.setAccountno(cu.getApplicationProperty("accountno", applicationPropertiesFile));
			updateuser.setDepartmentno(cu.getApplicationProperty("updatedepartmentno", applicationPropertiesFile));
			updateuser.setSalary(cu.getApplicationProperty("updatedsalary", applicationPropertiesFile));
			updateuser.setPincode(cu.getApplicationProperty("pincode", applicationPropertiesFile));
			response= RestAssured.given().header(header).contentType(ContentType.JSON)
					.body(updateuser)
					.when().put(EndPoints.UPDATE_DATA);
			return response;
			
			
		}
		
		public static Response deleteUserData() {
			
			CommonUtilities cu = new CommonUtilities();
	    	Properties applicationPropertiesFile=cu.loadFile("applicationProperties");
			Header header = new Header("token", token);
			DeleteUserDataPOJO deleteuser = new DeleteUserDataPOJO();
			deleteuser.setUserid(cu.getApplicationProperty("userid", applicationPropertiesFile));
			deleteuser.setId(cu.getApplicationProperty("id", applicationPropertiesFile));
			response= RestAssured.given().header(header).contentType(ContentType.JSON)
					.body(deleteuser)
					.when().delete(EndPoints.DELETE_DATA);
			return response;
		}

}
