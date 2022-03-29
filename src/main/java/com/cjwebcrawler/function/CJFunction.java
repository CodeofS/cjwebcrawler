package com.cjwebcrawler.function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cjwebcrawler.utils.CJConstants;

public class CJFunction implements CJFunctions{
	
	public WebDriver performLogin(WebDriver driver) throws Exception{
		driver.findElement(By.id(CJConstants.USERNAME_ID)).sendKeys(CJConstants.USERNAME);
	    driver.findElement(By.id(CJConstants.PASSWORD_ID)).sendKeys(CJConstants.PASSWORD);
	    driver.findElement(By.id(CJConstants.LOGIN_ID)).click();
	    String cjAbsoluteLoginUrl = driver.getCurrentUrl();
		System.out.println("Cj Absolute Login Url : "+cjAbsoluteLoginUrl);
	    return driver;
	}
	
	public WebDriver traverseHomePage(WebDriver driver) throws Exception {
        String homePageUrl = driver.getCurrentUrl();
	    System.out.println("Cj homePage Url : "+homePageUrl); 
	    Thread.sleep(2000);
	    System.out.println(driver.getPageSource());
	    WebElement reportElement = driver.findElement(By.xpath(CJConstants.REPORTS));
	    System.out.println("reports : "+reportElement.getText());
	    reportElement.click();
	    Thread.sleep(2000);
	    WebElement performanceElement = driver.findElement(By.xpath(CJConstants.PERFORMANCE));
	    System.out.println("performance : "+performanceElement.getText());
	    performanceElement.click();
		return driver;
	}
	
	public WebDriver traverseReports(WebDriver driver) throws Exception{
		WebElement download = driver.findElement(By.xpath(CJConstants.REPORT_DOWNLOAD));
	    download.click();
	    Thread.sleep(2000);	
	    WebElement downloadConfirm = driver.findElement(By.xpath(CJConstants.REPORT_CONFIRM_DOWNLOAD));
	    //{Using=xpath, value=(//div/button[text()='Download'])}
	    downloadConfirm.click();
		return driver;
	}

}
