package com.cjwebcrawler.utils;

public class CJConstants {
	
	// App data
	public static final String WEBSITE_URL = "https://www.cj.com/" ;
	public static final String USERNAME = "arcteryxaffiliates@allinclusivemarketing.com";
	public static final String PASSWORD = "aim12345" ;
	public static final String LOGIN_URL= null;
	
	// Driver details
	public static final String CHROME_DRIVER = "webdriver.chrome.driver";
	public static final String CHROME_DRIVER_LOCATION = "chromedriver";
	public static final String FIREFOX_DRIVER = "webdriver.gecko.driver";
	public static final String FIREFOX_DRIVER_LOCATION = "geckodriver";
	
	// Xpaths for Run report by website
	public static final String REPORTS = "(//span[@class='navbar-menu--title'])[4]";
	public static final String PERFORMANCE = "(//li[@class='menu-item'])[20]";
	public static final String SELECT_PERFORMANCE_BY = "(//b[@role='presentation'])[1]";
	public static final String SELECT_WEBSITE_OPTION = "(//div[@class='select2-result-label'])[5]";
	public static final String RUN_REPORT="(//button[@id='performanceReportRunButton'])";
	public static final String REPORT_DOWNLOAD = "(//button[@id='transactionDownloadButton'])";
	public static final String REPORT_CONFIRM_DOWNLOAD = "(//div/button[text()='Download'])";
	
	//HTML elements
	public static final String USERNAME_ID="username";
	public static final String PASSWORD_ID="password";
	public static final String LOGIN_ID="btn-login";
	
	
}
