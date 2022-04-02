package com.cjwebcrawler.function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cjwebcrawler.function.scenarios.CJReportsByWebsite;
import com.cjwebcrawler.utils.CJConstants;

public class ReportsByWebsite implements CJReportsByWebsite{
	
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
	    System.out.println("CJ homePage Url : "+homePageUrl); 
	    Thread.sleep(2000);
	    System.out.println(driver.getPageSource());
	    WebElement reportElement = driver.findElement(By.xpath(CJConstants.REPORTS));
	    System.out.println("clicked on reports : "+reportElement.getText());
	    reportElement.click();
	    Thread.sleep(2000);
	    WebElement performanceElement = driver.findElement(By.xpath(CJConstants.PERFORMANCE));
	    System.out.println("navigating to performance : "+performanceElement.getText());
	    performanceElement.click();
		return driver;
	}
	
    public WebDriver selectWebsiteOption(WebDriver driver) {
    	WebElement selectPerfBy = driver.findElement(By.xpath(CJConstants.SELECT_PERFORMANCE_BY));
    	selectPerfBy.click();
    	WebElement selectOption = driver.findElement(By.xpath(CJConstants.SELECT_WEBSITE_OPTION));
    	selectOption.click();
    	System.out.println("Selected performance by as website");
		return driver;
	}
    
    public WebDriver runReport(WebDriver driver) throws Exception{
    	WebElement runReport = driver.findElement(By.xpath(CJConstants.RUN_REPORT));
    	runReport.click();
    	System.out.println("Ran report successfully");
    	return driver;
    };
    
	public WebDriver traverseReports(WebDriver driver) throws Exception{
		WebElement download = driver.findElement(By.xpath(CJConstants.REPORT_DOWNLOAD));
	    download.click();
	    Thread.sleep(2000);	
	    WebElement downloadConfirm = driver.findElement(By.xpath(CJConstants.REPORT_CONFIRM_DOWNLOAD));
	    downloadConfirm.click();
	    System.out.println("Report downloaded successfully");
		return driver;
	}

}
