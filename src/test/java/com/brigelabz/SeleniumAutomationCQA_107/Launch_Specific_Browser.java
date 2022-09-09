package com.brigelabz.SeleniumAutomationCQA_107;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Launch_Specific_Browser {
    @Test
	public void launch_browser() throws InterruptedException {
    	@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
    	System.out.println("Select a browser:1.chrome browser 2.EdgeDriver 3.Firefox");
    	String str = scanner.nextLine();
    	System.out.println("you have entered:"+ str);
         
    
    switch(str) {
    case "1":
    	System.setProperty("webdriver.chrome.driver","/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://en-gb.facebook.com/");
		driver.close();
		break;
		
	case "2":
		System.setProperty("webdriver.edge.driver","/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/msedgedriver");
		WebDriver driver1 = new EdgeDriver();
		driver1.manage().window().maximize();
		Thread.sleep(2000);
		driver1.get("https://en-gb.facebook.com/");
		driver1.close();
		break;
	
	case "3":
		System.setProperty("webdriver.gecko.driver", "/Users/praveenanbu/eclipse-workspace/SeleniumAutomationCQA_107/Driver/geckodriver");
		WebDriver driver2 = new FirefoxDriver();
		driver2.manage().window().maximize();
		Thread.sleep(3000);
		driver2.get("https://en-gb.facebook.com/");
		driver2.close();
		break;
      }
    }
  }