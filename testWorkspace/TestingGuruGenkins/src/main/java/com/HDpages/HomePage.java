package com.HDpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		
		PageFactory.initElements(driver, this);
		
	}

}
