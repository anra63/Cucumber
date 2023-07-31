package com.training.steps;

import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.pagefactory.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseTest{
	
	PageFactory pageFactory = new PageFactory();
	
	BasePage page;

	@Before
	public void setup() {
		launchapplication();
		
	}

	
	@Given("User launch the {string} application")
	public void user_launch_the_application(String pageName) {
		page = pageFactory.initialize(pageName);
		System.out.println("Loading application == "+pageName);
	}

	@When("user enter username into the textbox {string} {string}")
	public void user_enter_username_into_the_textbox(String logicalName, String value) {
		page.enterintoTextBox(logicalName, value);

	}

	@When("user enter password into the textbox {string} {string}")
	public void user_enter_password_into_the_textbox(String logicalName, String value) {
		page.enterintoTextBox(logicalName, value);
	}

	@Then("Click on the button {string}")
	public void click_on_the_button(String logicalName) {
		page.clickonButton(logicalName);
	} 
	@Then("is textfield {string} is prefilled")
	public void is_textfield_is_prefilled(String logicalName) {
	   page.checkfield(logicalName);
	}
	
	@After
	public void closebrowser() {
		closedriver();
	}

}
