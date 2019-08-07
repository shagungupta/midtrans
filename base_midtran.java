package org.testing.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base_midtran {
	public ChromeDriver driver;
	@BeforeMethod
	public void browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sgupta8\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
			driver.get("https://demo.midtrans.com/");
		driver.manage().window().maximize();
	}
	
	}

