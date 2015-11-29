package com.QB.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	static WebDriver driver =new FirefoxDriver();
	
	
	public static void openURL(String url){
		driver.get(url);
	}
	
	public static void SetValue(String val,String loc){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(loc)));
		element.sendKeys(val);
	}

	public static void click(String loc){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(loc)));
		element.click();
	}

}
