package com.training.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.training.utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	static WebDriver driver;
	static CommonUtilities utility = new CommonUtilities();
	
	
	public static void launchapplication() {
		
		driver = getDriver();
		String applicationURL=null;
		
		try {
			applicationURL = utility.getproperty("applicationURL");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get(applicationURL);
		
		
	}
	
	public static WebDriver getDriver() {
		if(driver==null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	
		}
		return driver;
	}
	
	public static void  closedriver() {
		driver.close();
		driver = null;
	}
	
	

}
