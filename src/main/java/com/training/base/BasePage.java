package com.training.base;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
	
	WebDriver driver;
	
	Map<String, By> pageElementsMap = new HashMap<String, By>();
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void addLogicaltoByIdMap(String logicalName, By by) {
		pageElementsMap.put(logicalName, by);
	}
	
	private WebElement getElement(String logicalName) {
		 return driver.findElement(pageElementsMap.get(logicalName));
	}	
	
	
	public void enterintoTextBox(String LogicalName, String value) {
		  WebElement element = getElement(LogicalName);
		  waitForElement(element);
		  element.sendKeys(value);
	}  
	
	  
	  public void clickonButton(String LogicalName) {
		  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  WebElement element = getElement(LogicalName);
		  System.out.println("For Logical Name =="+LogicalName+" - "+element.isDisplayed());
		  System.out.println("For Logical Name =="+LogicalName+" - "+element.getTagName());
		  waitForElement(element);
		  element.click();

	  }
	  public void checkfield(String LogicalName) {
		  WebElement validateuser = getElement(LogicalName);
		  String Actualtext = validateuser.getText();
			String Exceptedtext = "2023@tekarc.com";
			Assert.assertEquals(Actualtext, Exceptedtext);
			
		  
	  }
	  private void waitForElement(WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver, 90);
			wait.until(ExpectedConditions.visibilityOf(element));
			
		}
	  public void validation(String LogicalName) {
		  WebElement valid = getElement(LogicalName);
		  waitForElement(valid);
		  valid.isDisplayed(); 
	  }

}
