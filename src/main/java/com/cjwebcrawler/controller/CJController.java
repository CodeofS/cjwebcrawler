package com.cjwebcrawler.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.WebDriver;

import com.cjwebcrawler.function.CJFunction;
import com.cjwebcrawler.utils.CJConstants;
import com.cjwebcrawler.utils.CJUtils;

public class CJController {

	public void automateCJ() {

		WebDriver driver = CJUtils.getWebDriver();
		CJFunction cjFunction = new CJFunction();
		
		try {
			System.out.println("Connecting to cj.com : " + CJConstants.WEBSITE_URL);			
			Document cjWebsite = Jsoup.connect(CJConstants.WEBSITE_URL).get();
			Elements websitelinks = cjWebsite.select("a[href]");

			String loginUrl = null;
			for (Element link : websitelinks) {
				if (link.text().equals("Login")) {
					loginUrl = link.attr("href");
					break;
				}
			}

			// Launch website
			driver.navigate().to(loginUrl);
			driver = cjFunction.performLogin(driver);
			Thread.sleep(3000);

			// Traverse Home Page
			driver = cjFunction.traverseHomePage(driver);
			Thread.sleep(60000);

			// Traverse Reports
			driver = cjFunction.traverseReports(driver);

		} catch (Exception e) {
			driver.close();
			e.printStackTrace();
		}
	}
}
