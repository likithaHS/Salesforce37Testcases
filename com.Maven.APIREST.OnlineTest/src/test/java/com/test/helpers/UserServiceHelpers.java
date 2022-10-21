package com.test.helpers;

import java.util.List;
import java.util.Properties;

import org.hamcrest.Matchers;

import com.test.POJO.AddDataResponsePOJO;
import com.test.POJO.AddResponseEmployeePOJO;
import com.test.POJO.DataPOJO;
import com.test.POJO.EmployeeReponsePOJO;
import com.test.utility.CommonUtilities;
import com.test.utility.EndPoints;
import com.test.utility.GenerateReport;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserServiceHelpers {

	private static Response response;
	public static String addIdString;
	public static GenerateReport report = null;

	public static String getBaseuri() {
		CommonUtilities cu = new CommonUtilities();
		Properties applicationPropertiesFile = cu.loadFile("applicationProperties");
		String BaseURL = cu.getApplicationProperty("url", applicationPropertiesFile);
		return BaseURL;
	}

	public static List<DataPOJO> getUserData() {
		response = RestAssured.given().when().get(EndPoints.GET_DATA);
		EmployeeReponsePOJO getEmployeeDeatils = response.as(EmployeeReponsePOJO.class);
		response.then().statusCode(200);
		response.then().body("status", Matchers.equalTo("success"));
		System.out.println("Response body status is:" + getEmployeeDeatils.getStatus());
		report.logTestInfo("Response body status is:" + getEmployeeDeatils.getStatus());
		List<DataPOJO> getEmplyoeeData = getEmployeeDeatils.getData();
		System.out.println("Total number of data record is:" + getEmplyoeeData.size());
		report.logTestInfo("Total number of data record is:" + getEmplyoeeData.size());
		// System.out.println("Total number of users extracted from getUserdata is
		// "+response.jsonPath().get("data.size()"));

		return getEmplyoeeData;

	}

	public static Response addUSerData() {
		CommonUtilities cu = new CommonUtilities();
		Properties applicationPropertiesFile = cu.loadFile("applicationProperties");
		DataPOJO adduser = new DataPOJO();

		adduser.setId(Integer.parseInt(cu.getApplicationProperty("id", applicationPropertiesFile)));
		adduser.setEmployeeName(cu.getApplicationProperty("employeeName", applicationPropertiesFile));
		adduser.setEmployeeSalary(
				Integer.parseInt(cu.getApplicationProperty("employeeSalary", applicationPropertiesFile)));
		adduser.setEmployeeAge(Integer.parseInt(cu.getApplicationProperty("employeeAge", applicationPropertiesFile)));
		adduser.setProfileImage(cu.getApplicationProperty("profileImage", applicationPropertiesFile));

		response = RestAssured.given().contentType(ContentType.JSON).body(adduser).when().post(EndPoints.CREATE_DATA);
		AddResponseEmployeePOJO addEmployeeDeatils = response.as(AddResponseEmployeePOJO.class);
		AddDataResponsePOJO addDataDetails = addEmployeeDeatils.getData();
		Integer addedID = addDataDetails.getId();
		addIdString = addedID.toString();
		System.out.println("The added id is:" + addedID);
		report.logTestInfo("The added id is:" + addedID);

		return response;

	}

	public static Response deleteUserData() {
		String mergeTwoString = EndPoints.DELETE_DATA3.concat(addIdString);
		response = RestAssured.given().contentType(ContentType.JSON).when().delete(mergeTwoString);
		return response;
	}

	public static Response deleteUserData2() {
		response = RestAssured.given().contentType(ContentType.JSON).when().delete(EndPoints.DELETE_DATA4);
		return response;
	}

	public static Response getUserDatabyID() {
		response = RestAssured.given().contentType(ContentType.JSON).when().get(EndPoints.GET_DATA2);

		//response.then().statusCode(200);
		//response.then().body("status", Matchers.equalTo("success"));
		// Map<String,?> Emplyoeedetails = response.path("data.find{it.id == 2}");
		// System.out.println("EmployeeDeatils: "+Emplyoeedetails);
		//response.prettyPrint();
		return response;

	}

}
