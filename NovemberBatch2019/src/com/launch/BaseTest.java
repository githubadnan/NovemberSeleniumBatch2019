package com.launch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class BaseTest 
{
	public static WebDriver driver;
	public static Properties p;
	public static String projectPath=System.getProperty("user.dir");
	
	
	public static void init () throws IOException
	{
		//FileInputStream fis = new FileInputStream("D:\\Make A New Folder\\Selenium_Practice\\NovemberBatch2019\\data.properties");
		FileInputStream fis = new FileInputStream(projectPath+"//data.properties");
		p=new Properties();
		p.load(fis);
	}
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(p.getProperty(browser).equals("firefox")){
			
			System.setProperty("webdriver.gecko.driver", projectPath+"\\geckodriver.exe");
			
			ProfilesIni p=new ProfilesIni();
			FirefoxProfile profile = p.getProfile("novemberprofile");
			
			FirefoxOptions option = new FirefoxOptions();
			option.setProfile(profile);
			
			driver = new FirefoxDriver(option);
		}
	}
	
	public static void navigateUrl(String url) 
	{
		//driver.get(p.getProperty(url));
		driver.navigate().to(p.getProperty(url));
	}
	
}
