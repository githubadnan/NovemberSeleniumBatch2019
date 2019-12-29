package com.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch 
{

	public static void main (String[] args)
	{
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Make A New Folder\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.amazon.in");	
		
		System.setProperty("webdriver.gecko.driver", "D:\\Make A New Folder\\jars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.bestbuy.com");
	}
	
}
