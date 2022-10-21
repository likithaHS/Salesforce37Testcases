Feature: CRUD APIREST testing
   
  @Login
  Scenario: Login to API
    Given the endpoint is up
    When i send userid and password
    When i send post request for login
    Then i validate the status code 
    And i will get the token
    
    @GetData
    Scenario: get List of User data
    Given the endpoint is up
    When i send userid and password
    When i send post request for login
    Then i validate the status code 
    And i will get the token
    Then i will get list of user data
