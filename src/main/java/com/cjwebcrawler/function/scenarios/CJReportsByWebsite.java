package com.cjwebcrawler.function.scenarios;

import org.openqa.selenium.WebDriver;

public interface CJReportsByWebsite {

	public WebDriver performLogin(WebDriver driver) throws Exception;
	
	public WebDriver traverseHomePage(WebDriver driver) throws Exception;
	
	public WebDriver selectWebsiteOption(WebDriver driver) throws Exception;
	
	public WebDriver runReport(WebDriver driver) throws Exception;
	
	public WebDriver traverseReports(WebDriver driver) throws Exception;
}
