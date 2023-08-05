Feature: I want to login with Orangehrm

Scenario: Login Functionality of OrangeHRM

          Given OrangeHrm Url has been provided
          When user enters Credentials to Login
          |Username|Password|
          | admin@phptravels.com | demoadmin|
          | admin@phptravels.com | demoadmin|
          And user click on Submit button
          Then user can able to login successfully.

    
