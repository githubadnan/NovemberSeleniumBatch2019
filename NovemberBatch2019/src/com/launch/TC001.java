package com.launch;

import java.io.IOException;

import org.openqa.selenium.By;

public class TC001 extends BaseTest
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		init();
		
		launch ("chromebrowser");
		
		//navigateUrl("amazonurl");
		
		navigateUrl("hblurl");
		
		driver.manage().window().maximize();
		
/*		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().deleteAllCookies();
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		driver.navigate().forward();
		
		Thread.sleep(4000);
		
		driver.navigate().refresh(); */
		
		//driver.findElement(By.linkText("KNOW MORE")).click();
		
		//driver.close(); 
		Thread.sleep(5000);
		driver.quit();
	}

}
