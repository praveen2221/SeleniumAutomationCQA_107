package com.brigelabz.SeleniumAutomationCQA_107;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBox_selectedorNot {

	@Test
	public void checkBox_selectedorNot_Test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/login/");
        Thread.sleep(2000);
		WebElement KeepMeLogIN_Checkbox = driver.findElement(By.name("email"));
		//select the checkbox
		KeepMeLogIN_Checkbox.click();
		if (KeepMeLogIN_Checkbox.isSelected()) {
		System.out.println("Checkbox is selected");
		}else{
		System.out.println("Checkbox is NOT selected");
		}
	}
	
	@Test
	public void verifyUNtextboxisEnabledinActitime_test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/login/");
        Thread.sleep(2000);
        WebElement UN = driver.findElement(By.id("email"));
        if (UN.isEnabled()) {
        System.out.println("email text box is enabled");
        }else {
        System.out.println("email text box is disabled");
        }
        driver.close();
	}
	
	@Test
	public void verifyKeepMeLoggedInisaCheckboxinActitime_Test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/login/");
        Thread.sleep(2000);
        String elementType = driver.findElement(By.id("email")).getAttribute("type");
        System.out.println(elementType);
        if (elementType.equalsIgnoreCase("checkbox")) {
        System.out.println("it is a checkbox");
        }else{
        System.out.println("it is NOT a checkbox");
        }
	}
}
