package com.cjwebcrawler.cjwebcrawler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cjwebcrawler.controller.ReportByWebsiteController;

@SpringBootApplication
public class CjwebcrawlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CjwebcrawlerApplication.class, args);
		new ReportByWebsiteController().automateCJ();	
	}
}
