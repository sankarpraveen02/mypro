package com.jenkinsdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jenkins_demo {

	WebDriver pageUnderTest = null;
	
	
	public WebDriver getDriverHandle(String stringWebSiteURL)
	{
		String exePath = "D:\\Selenium\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", exePath);
		
		WebDriver driver = new ChromeDriver();
		driver.get(stringWebSiteURL);
		this.pageUnderTest=driver;
		return driver;
	}
	
	
	public static void main(String args[]) throws InterruptedException
	{
		Jenkins_demo myPageRef = new Jenkins_demo();
		
/*		WebDriver webDriver = myPageRef.getDriverHandle("https://www.github.com/");
	Thread.sleep(4500);
		
		//Browser Commands
	//	System.out.println("Title was "+webDriver.getTitle());
	//	System.out.println("CurrentURL was "+webDriver.getCurrentUrl());
		//System.out.println("PageSource was "+webDriver.getPageSource());
		
		//Navigational Commands
	//	System.out.println("Going to click Todays Deals");
	//	webDriver.findElement(By.linkText("Today's Deals")).click();
		
		WebElement searchBox= webDriver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/span/div/a[1]"));
		//Click on the searchBox
		searchBox.click();
		WebElement searchBox1= webDriver.findElement(By.id("login_field"));
		Thread.sleep(2000);
		
		searchBox1.sendKeys("sankarpraveen02");
		
		WebElement searchBox2= webDriver.findElement(By.id("password"));
		searchBox2.sendKeys("Letsgo@1394");
		Thread.sleep(2500);
		
			WebElement searchButton= webDriver.findElement(By.name("commit"));
//		//Click on the searchBox
	searchButton.click();
	WebElement searchBox3= webDriver.findElement(By.xpath("//*[@id='your_repos']/div/div[2]/ul/li/a/span/span"));
	searchBox3.click();
	WebElement searchBox4= webDriver.findElement(By.xpath("//*[@id='js-repo-pjax-container']/div[2]/div[1]/div[5]/details/summary"));
	searchBox4.click();
	WebElement searchBox5= webDriver.findElement(By.xpath("//*[@id='js-repo-pjax-container']/div[2]/div[1]/div[5]/details/div/div/div[3]/a[2]"));
	searchBox5.click();
	}
	*/
	

	WebDriver webDriver = myPageRef.getDriverHandle("https://www.google.com/");
	WebElement searchBox= webDriver.findElement(By.name("q"));
	searchBox.sendKeys("selenium");
	
	WebElement searchBox1 = webDriver.findElement(By.name("btnK"));
	searchBox1.click();
	webDriver.navigate().back();

	
	}

}