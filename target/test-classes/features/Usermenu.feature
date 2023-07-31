
  Feature: Login Scenarios to Salesforce Application
  
  
  Scenario: usermenu validation
  Given User launch the "UserMenuPage" application
	When user enter username into the textbox "username" "2023@tekarc.com"
	When user enter password into the textbox "password" "Dareram@30"
	Then Click on the button "Login"
  Then Click on the button "userprofile"
  Then Click on the button "MyProfile" 
  
  Scenario: usermenu validation
  Given User launch the "UserMenuPage" application
	When user enter username into the textbox "username" "2023@tekarc.com"
	When user enter password into the textbox "password" "Dareram@30"
	Then Click on the button "Login"
  Then Click on the button "userprofile"
  When Click on the button "MyProfile"
  Then Click on the button "Edit"
  Then Click on the button "Abouttab"