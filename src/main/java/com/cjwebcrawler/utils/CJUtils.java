package com.cjwebcrawler.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CJUtils {
	
	public static WebDriver getWebDriver() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
	    ChromeOptions o= new ChromeOptions();
	      // add Incognito parameter
	    o.addArguments("--incognito");
	      // DesiredCapabilities object
	    DesiredCapabilities c = DesiredCapabilities.chrome();
	      //set capability to browser
	    c.setCapability(ChromeOptions.CAPABILITY, o);
	    WebDriver driver = new ChromeDriver(o);
	  
	    return driver;
	}

}
