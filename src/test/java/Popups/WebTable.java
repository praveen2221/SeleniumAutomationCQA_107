package Popups;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTable {

	@BeforeTest
		public void launch_Browser() {
			System.setProperty("webdriver.chrome.driver","/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/chromedriver");
		}

	@Test
	public void webTable_Example() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/webTable.html");
		List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
		int totalRows = allRows.size();
		System.out.println("total number of rows present in the table is :"+ totalRows);
		List<WebElement> allColumns = driver.findElements(By.xpath("//th"));
		int totalColumns = allColumns.size();
		System.out.println("Total number of columns in the table is :" + totalColumns);
		List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));
		int totalCells = allCells.size();
		System.out.println("Total number of cells present in the table is :" + totalCells);
		int countNumberValue = 0;
		int sum=0;
		for (WebElement cell : allCells) {
			String cellValue = cell.getText();
			try{
				int number = Integer.parseInt(cellValue);
				System.out.println(""+number);
				countNumberValue++;
				sum = sum+number;
			}
			catch (Exception e) {	
			}
			}
		System.out.println("Total count of numeric values is :"+countNumberValue);
		System.out.println("Total sum of all the numeric values is :"+sum);
		driver.close();
	}
}
