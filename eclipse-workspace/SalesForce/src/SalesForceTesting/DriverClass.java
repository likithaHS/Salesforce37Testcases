package SalesForceTesting;

import java.io.IOException;

public class DriverClass extends FirstScript {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//firefoxAutomationScript();
		//AutomationScript("firefox");
		errorMessage01("firefox");
		Thread.sleep(5000);
		loginSalesForce2("firefox");
		/*(Thread.sleep(5000);
		loginSalesForce3("firefox");
		Thread.sleep(5000);
		loginSalesForce4b("firefox");
		Thread.sleep(5000);
		loginSalesForce4a("firefox");
		*/
		
	}

}
