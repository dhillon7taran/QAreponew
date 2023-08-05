Feature: I want to login with Orangehrm

Scenario: Login Functionality of OrangeHRM

          Given OrangeHrm Url has been provided
          When user enters Credentials to Login
          | username | password |
          | Admin | admin123|
          | John | admin234|
          And user click on Submit button
          Then user can able to login successfully.

    
