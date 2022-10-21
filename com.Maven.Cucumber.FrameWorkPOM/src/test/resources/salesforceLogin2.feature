Feature: login feature

 Background: Goto url
    Given when you go to url 
    
  @smoke
  Scenario: login with correct credentials
    When user on "loginPage"
    When i enter value of username 
    When i enter value of password
    And  click on login button
    When user on "homePage"
    Then i should get the page title
    
  @regression
  Scenario: login with blank password
    When user on "loginPage"
    When i enter value of username 
    When no password is entered
    And  click on login button
    Then i should get error message 
  
    @regression
  Scenario: login with invalid username and  password
    When user on "loginPage"
    When i enter invalid value of username 
    When i enter invalid value of password 
    And  click on login button
    Then i should get enter valid username password message  
    
    @smoke
  Scenario: login with correct credentials and remember selected
    When user on "loginPage"
    When i enter value of username 
    When i enter value of password
    And  click on remember
    And  click on login button
    When user on "homePage"
    When i should get the page title
    And click on logout
    When user on "loginPage"
    Then check for Username and remember
    
   @regression
  Scenario: forgot password
    When user on "loginPage"
    When click on forgot password
    When user on "forgotPasswordPage" 
    When i enter value of username in forgotpage
    And Click on continue
    When user on "checkemailpage"
    Then i should get check email page 
    
    
    
    
  