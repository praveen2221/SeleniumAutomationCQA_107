package com.brigelabz.SeleniumAutomationCQA_107;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Login_Into_Gmail {

	@Test
	public void gmail_contextClickDemo_mailArchive() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/geckodriver");
	    WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S2030757326%3A1662013252915337&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQN2RmV19LXDejG6dGLjpyz5RDiBBekMRubaDNeP0kyE3fDqjiBczI7NbNCty1Vyw560iXozQmLhXQ");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//enter email id
		driver.findElement(By.id("identifierId")).sendKeys("praveenap3331@gmail.com");
		//click on Next button
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		Thread.sleep(3000);
		//enter password id
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("praveen2221");
		//click on Next button
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(10000);
	}
	
	@Test
	public void moveToElement() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/geckodriver");
	    WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
		Thread.sleep(2000);
	}
	
	@Test
	public void dragAndDrop() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/geckodriver");
	    WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		String xp1 = "//div[@id='draggable']";
		WebElement block1 = driver.findElement(By.xpath("xp1"));
		String xp2 = "//div[@id='droppable']";
		WebElement block2 = driver.findElement(By.xpath("xp2"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(block1,block2).build().perform();
	}
}
