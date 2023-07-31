package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class UserMenuPage extends BasePage {
	static WebDriver driver;
	
	public UserMenuPage() {
		super(driver=BaseTest.getDriver());
		addLogicaltoByIdMap("username", By.id("username"));
		addLogicaltoByIdMap("password", By.id("password"));
		addLogicaltoByIdMap("Login", By.id("Login"));
		addLogicaltoByIdMap("RememberMe", By.xpath("//label[text()='Remember me']"));
		addLogicaltoByIdMap("userprofile", By.xpath("//span[contains(text(),'Anup ABCD')]"));
		addLogicaltoByIdMap("MyProfile", By.xpath("//a[text()='My Profile']"));
		addLogicaltoByIdMap("Edit",By.xpath("//a[@class=\"contactInfoLaunch editLink\"]"));
		addLogicaltoByIdMap("Abouttab",By.xpath("//a[contains(text(),'About')]"));
	}
}


