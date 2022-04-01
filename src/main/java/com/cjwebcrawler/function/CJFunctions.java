package com.cjwebcrawler.function;

import org.openqa.selenium.WebDriver;

public interface CJFunctions {

	public WebDriver performLogin(WebDriver driver) throws Exception;
	
	public WebDriver traverseHomePage(WebDriver driver) throws Exception;
	
	public WebDriver selectWebsiteOption(WebDriver driver) throws Exception;
	
	public WebDriver traverseReports(WebDriver driver) throws Exception;
}
