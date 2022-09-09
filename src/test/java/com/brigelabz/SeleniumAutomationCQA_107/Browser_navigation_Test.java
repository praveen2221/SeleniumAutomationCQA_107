package com.brigelabz.SeleniumAutomationCQA_107;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser_navigation_Test {

	@Test
	public void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.close();
	}
}
