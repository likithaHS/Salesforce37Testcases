Feature: login feature
checking the login feature of firebase app

  Scenario: login with correct credentials
   Given when you go to url "https://login.salesforce.com/"
    When i enter value of username as "likithahs@gmail.com" and password as "Shaurya$12"
    And  click on login button
    Then i should get the page title as "Home Page ~ Salesforce - Developer Edition"
    
  Scenario: login with correct username but blank password
   Given when you go to url "https://login.salesforce.com/"
    When i enter value of username as "likithahs@gmail.com" and password as ""
    And  click on login button
    Then i should get the error message as "Please enter your password."  

  Scenario: login with incorrect username and password
   Given when you go to url "https://login.salesforce.com/"
    When i enter value of username as "12345" and password as "123"
    And  click on login button
    Then i should get the error message as "Please check your username and password. If you still can't log in, contact your Salesforce administrator." 
    
  Scenario: login with correct credentials with remember button selected
   Given when you go to url "https://login.salesforce.com/"
    When i enter value of username as "likithahs@gmail.com" and password as "Shaurya$12"
    And  click on login button
    Then i should get the page title as "Home Page ~ Salesforce - Developer Edition"  
    