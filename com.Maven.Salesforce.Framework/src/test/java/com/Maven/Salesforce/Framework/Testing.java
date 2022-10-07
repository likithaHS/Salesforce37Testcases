package com.Maven.Salesforce.Framework;

import org.testng.annotations.Test;

public class Testing {
	@Test(priority=1)
	
	public static void login() {
		System.out.println("Login");
	}
	@Test(priority=2,dependsOnMethods = {"login"})
	public static void password() {
		System.out.println("password");
	}
	@Test(priority=3)
	public static void logout() {
		System.out.println("logout");
	}

}
