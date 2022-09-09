package com.brigelabz.SeleniumAutomationCQA_107;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch_Browser_Test {
   
	@Test
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		String title = driver.getTitle();
		System.out.println("The title of the page is :" + title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The url of the page is :"+ currentUrl);
		String pageSource = driver.getPageSource();
		System.out.println("The source code of the page is :"+ pageSource);
		Thread.sleep(2000);
		driver.close();
	}
}
