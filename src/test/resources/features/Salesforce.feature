Feature: Login Scenarios to Salesforce Application

#Comments on the features  /* */ //

Scenario: Login into SalesForce application with valid username and password
Given User launch the "LoginPage" application
When user enter username into the textbox "username" "2023@tekarc.com"
When user enter password into the textbox "password" "Dareram@30"
Then Click on the button "Login"


Scenario: Login into SalesForce application with valid username and password
Given User launch the "LoginPage" application
Then Click on the button "RememberMe"
When user enter username into the textbox "username" "2023@tekarc.com"
When user enter password into the textbox "password" "Dareram@30"
Then Click on the button "Login"

Scenario: Login into SalesForce application with valid username and password
Given User launch the "LoginPage" application
When Click on the button "RememberMe"
When user enter username into the textbox "username" "2023@tekarc.com"
When user enter password into the textbox "password" "Dareram@30"
When Click on the button "Login"
Then Click on the button "userprofile"
Then Click on the button "logout"
Then is textfield "prefilled-username" is prefilled 

Scenario: Login into SalesForce application with valid username and password
Given User launch the "LoginPage" application
When Click on the button "RememberMe"
When user enter username into the textbox "username" "2023@tekarc.com"
Then Click on the button "forgotpassword" 


Scenario: Login into SalesForce application with valid username and password
Given User launch the "LoginPage" application
When user enter username into the textbox "username" "203@tekarc.com"
When user enter password into the textbox "password" "2211221"
Then Click on the button "Login"




