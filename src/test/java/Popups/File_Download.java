package Popups;

import java.awt.AWTException;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class File_Download {

	private ChromeDriver driver;

	@BeforeTest
	public void launch_Browser() {
		System.setProperty("webdriver.chrome.driver","/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/chromedriver");
	}
	
	@Test
	public void file_Download() throws AWTException{
	    driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		WebElement downloadLink=driver.findElement(By.linkText("4.4.0"));
		downloadLink.click();
		File fileLocation = new File("/Users/praveenanbu/Downloads");
		File[] totalFiles=fileLocation.listFiles();
		for (File file : totalFiles) {
			if(file.getName().equals("selenium-server-4.4.0.jar"));
			System.out.println("File is downloaded");
			break;
		}
	}
}
