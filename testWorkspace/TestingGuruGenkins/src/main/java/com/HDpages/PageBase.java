package com.HDpages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	
	
	private final String baseUrl = "http://www.homedepot.com";
	WebDriver driver;

	/* Loading Config property files */
	public static Properties loadProperties() throws IOException {
		Properties prop = new Properties();
		FileInputStream in = new FileInputStream("config.properties");
		prop.load(in);
		return prop;

	}

	public PageBase(WebDriver driver) {
		this.driver = driver;

	}

	public HomePage NavigateToHomePage() throws IOException {

		Properties prop = new Properties();
		prop = loadProperties();
		String url = prop.getProperty("BaseUrl");
		
		driver.get(baseUrl);
		System.out.println(url);
		return new HomePage(driver);

	}
}
