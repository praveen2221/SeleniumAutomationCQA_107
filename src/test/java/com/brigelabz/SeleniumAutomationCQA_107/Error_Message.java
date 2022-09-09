package com.brigelabz.SeleniumAutomationCQA_107;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Error_Message {

	@Test
	public void loginTextXpathTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://en-gb.facebook.com/");
        Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("praveenap2221@email.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("praveen2223");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@name='login']")).click();
        Thread.sleep(6000);
        String exp ="The password that you've entered is incorrect. Forgotten password?";
        WebElement m = driver.findElement(By.className("_9ay7"));
        String act = m.getText();
        System.out.println("Error message is:"+ act);
        Assert.assertEquals(exp, act);
        driver.close();
	}
	
	@Test
	public void signupWithXpathTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://en-gb.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Praveen");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("A");
        driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("praveenap3331@gmail.com");
        driver.findElement(By.xpath("//input[start-with(@id,'u_'),(@id,'reg_email_confirmation__')]")).sendKeys("praveenap3331@gmail.com");
        driver.findElement(By.xpath("//input[contains(@name,'reg passwd__')]")).sendKeys("praveen2221");
        driver.findElement(By.xpath("//select[@name='birthday_day')]")).sendKeys("12");
        driver.findElement(By.xpath("//option[contains(text(),'Dec')]")).click();
        driver.close();
	}
}
