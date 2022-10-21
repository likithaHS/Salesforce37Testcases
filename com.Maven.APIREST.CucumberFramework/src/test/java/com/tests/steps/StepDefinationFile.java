package com.tests.steps;

import java.util.List;
import com.test.crud.pojo.GetUserDataPOJO;
import com.test.helpers.ReuseableMethod;
import com.test.helpers.UserServiceHelpers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;


public class StepDefinationFile extends UserServiceHelpers {
	
@Given("the endpoint is up")
public void the_endpoint_is_up() {
	
	RestAssured.baseURI=getBaseuri();
   
}
@When("i send userid and password")
public void i_send_userid_and_password() {
	
	userPassword();
   
}
@When("i send post request for login")
public void i_send_post_request_for_login() {
	
	response =	loginToApi();
   
}

@Then("i validate the status code")
public void i_validate_the_status_code() {
	
	ReuseableMethod.verifyStatusCode(response, 201);
    
}
@Then("i will get the token")
public void i_will_get_the_token() {
	String token=getToken();
	System.out.println("token===="+token);
}

@Then("i will get list of user data")
public void i_will_get_list_of_user_data() {
	List<GetUserDataPOJO> listOfUsers=getUserData();
	   System.out.println("First user information in the userlist is :\n"+listOfUsers.get(0));
}
	

}
