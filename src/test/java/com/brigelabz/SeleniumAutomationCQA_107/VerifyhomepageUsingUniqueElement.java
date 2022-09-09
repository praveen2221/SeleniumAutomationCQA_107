package com.brigelabz.SeleniumAutomationCQA_107;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyhomepageUsingUniqueElement {

	@Test
	public void verifyhomepageUsingUniqueElementTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("praveenap3331@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("praveen2221");
        driver.findElement(By.xpath("//button[@name='login']")).click();
        Thread.sleep(3000);
        WebElement logoutBtn = driver.findElement(By.xpath("//span[text()='Log Out']"));
        if (logoutBtn.isDisplayed()) {
        System.out.println("Home page is displayed");
        } else{
        System.out.println("Home page is NOT displayed");
        }
        driver.close();
	}
}
