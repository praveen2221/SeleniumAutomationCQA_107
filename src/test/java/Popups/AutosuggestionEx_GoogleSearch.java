package Popups;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutosuggestionEx_GoogleSearch {

	private EdgeDriver driver;

	@BeforeTest
	public void launch_Browser() {
		System.setProperty("webdriver.edge.driver","/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/msedgedriver");
	    driver = new EdgeDriver();
	}
	
	@Test
	public void autosuggestionEx_GoogleSearch_Test() throws InterruptedException {
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> allOptions =driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
		int count = allOptions.size();
		System.out.println("Number of values present in the dropdown is : "+ count);
		String expectedValue="selenium interview questions";
		for (WebElement option : allOptions) {
			String text = option.getText();
			System.out.println(" "+text);
			if (text.equalsIgnoreCase(expectedValue)) {
				option.click();
				driver.close();
				break;
			}
		}
	}
}
