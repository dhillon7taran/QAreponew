Feature: I want to login with Orangehrm

Scenario Outline:: Login Functionality of OrangeHRM

          Given OrangeHrm Url has been provided
          When user enters "<username>" And "<password>"
          And user click on Submit button
          Then user can able to login successfully.
          
Examples:
 						| username | password |
    				| Admin|admin123|
    				| Admin|admin345|
     			  | Admin|admin123|
    
