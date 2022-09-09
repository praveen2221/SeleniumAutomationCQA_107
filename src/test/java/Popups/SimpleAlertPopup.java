package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleAlertPopup {

	@Test
	public void simple_Alert_Popup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	@Test
	public void conformation_popup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	@Test
	public void prompt_popup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
}
