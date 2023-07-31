package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class LoginPage extends BasePage {
	static WebDriver driver;
	
	public LoginPage() {
		super(driver=BaseTest.getDriver());
		addLogicaltoByIdMap("username", By.id("username"));
		addLogicaltoByIdMap("password", By.id("password"));
		addLogicaltoByIdMap("Login", By.id("Login"));
		addLogicaltoByIdMap("RememberMe", By.xpath("//label[text()='Remember me']"));
		addLogicaltoByIdMap("userprofile", By.xpath("//span[contains(text(),'Anup ABCD')]"));
		addLogicaltoByIdMap("logout", By.xpath("//a[text()='Logout']"));
		addLogicaltoByIdMap("prefilled-username", By.xpath("//span[@id='idcard-identity']"));
		addLogicaltoByIdMap("forgotpassword", By.xpath("//a[text()='Forgot Your Password?']"));
		 
	}

}
