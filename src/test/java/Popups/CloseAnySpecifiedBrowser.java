package Popups;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CloseAnySpecifiedBrowser {


	private ChromeDriver driver;
	private String title;

	@BeforeTest
	public void launch_Browser() {
		System.setProperty("webdriver.chrome.driver","/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test
	public void close_Any_Specified_Browser() throws InterruptedException {
        driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String printID = driver.getWindowHandle();
		System.out.println("PrintID:"+printID);
		driver.findElement(By.linkText("Register now")).click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : "+ count);
		for (String windowHandle : allWindowHandles) {
			driver.switchTo().window(windowHandle);
		if (windowHandle.equals(printID)) {
			driver.close();
		}
	  }	
	}
	
	@Test
	public void CloseMainBrowserOnly() {
		driver.get("https://www.naukri.com/");
		String parentWindowhandleID = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : "+ count);
		for (String windowHandle : allWindowHandles) {
		driver.switchTo().window(windowHandle);
		if (windowHandle.equals(parentWindowhandleID)) {
		driver.close();
		System.out.println("Main Browser window with title -->"+ title +" --> is closed");
		}
	  }
	}
	
	@Test
	public void CloseALLChildbrowsersONLY() {
		driver.get("https://www.naukri.com/");
		String parentWindowhandleID = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();

		System.out.println("Number of browser windows opened on the system is : "+ count);
		for (String windowHandle : allWindowHandles) {
		driver.switchTo().window(windowHandle);
		String title = driver.getTitle();
		if (!windowHandle.equals(parentWindowhandleID)) {
		driver.close();
		System.out.println("Child Browser window with title -->"+ title +" --> is closed");
		}
	  }
	}
	
	@Test
	public void HandleTabs_using_getWindowHandles() {
		driver.get("https://www.irctc.co.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("//a[@aria-label =\"Menu BUSES. Website will be opened in new tab\"]")).click();
		System.out.println(driver.getTitle());
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent =it.next();
		String child =it.next();
		System.out.println(parent);
		System.out.println(child);
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void ChildBrowserPopUp() {
		driver.get("https://www.naukri.com/");
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : "+ count);
		for (String windowHandle : allWindowHandles) {
		driver.switchTo().window(windowHandle);
		String title = driver.getTitle();
		System.out.println("Window handle id of page -->"+ title +" --> is : "+windowHandle);
		driver.close();
		}
	}
}
