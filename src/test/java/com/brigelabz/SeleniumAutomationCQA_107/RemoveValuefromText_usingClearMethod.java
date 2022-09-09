package com.brigelabz.SeleniumAutomationCQA_107;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RemoveValuefromText_usingClearMethod {

	@Test
	public void removeValuefromText_usingClearMethod_Test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/login/");
        Thread.sleep(2000);
        String value = driver.findElement(By.id("email")).getAttribute("value");
        System.out.println("Value present inside the text box is : "+value);
        driver.findElement(By.id("email")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("praveenap3331@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys(Keys.COMMAND+"a"+Keys.DELETE); 
        driver.findElement(By.id("email")).sendKeys(Keys.COMMAND+"a") ;
        driver.findElement(By.id("email")).sendKeys(Keys.DELETE);
        Thread.sleep(2000);
	}
	
	@Test
    public void removeValuefrom_ClearMethod_Test() throws InterruptedException{
    	System.setProperty("webdriver.chrome.driver","/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/login/");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("praveenap3331@gmail.com");
        Thread.sleep(2000);
        String value = driver.findElement(By.id("email")).getAttribute("value");
        System.out.println("Value present inside the text box is : "+value);
        driver.findElement(By.id("email")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("praveenap3331@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys(Keys.COMMAND+"a"+Keys.DELETE);
        driver.findElement(By.id("email")).sendKeys(Keys.COMMAND+"a") ;
        driver.findElement(By.id("email")).sendKeys(Keys.DELETE);
        Thread.sleep(2000);
    }
}
