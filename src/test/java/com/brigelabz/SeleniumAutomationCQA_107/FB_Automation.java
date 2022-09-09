package com.brigelabz.SeleniumAutomationCQA_107;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FB_Automation {

	@Test
	public void fb_login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://en-gb.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("praveenap2221@email.com");
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("praveen2221");
        Thread.sleep(2000);
//        driver.findElement(By.id("pass")).clear();
//        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
	}
	
	@Test
	public void facebook_signup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://en-gb.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Praveen");
        driver.findElement(By.name("lastname")).sendKeys("A");
        driver.findElement(By.name("reg_email__")).sendKeys("praveenap3331@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("praveenap3331@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.id("password_step_input")).sendKeys("praveen2221");
        Thread.sleep(3000);
        driver.findElement(By.name("birthday_day")).sendKeys("12");
        Thread.sleep(3000);
        driver.findElement(By.id("month")).sendKeys("Dec");
        Thread.sleep(1000);
        driver.findElement(By.id("year")).sendKeys("2000");
        Thread.sleep(5000);
        driver.findElements(By.name("sex")).get(1).click();
        Thread.sleep(5000);
        driver.findElement(By.name("websubmit")).click();
	}
}
