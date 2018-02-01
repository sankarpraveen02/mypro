package com.automation.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LandingPage {

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
	
	
	public static void main(String args[])
	{
		LandingPage myPageRef = new LandingPage();
		
		WebDriver webDriver = myPageRef.getDriverHandle("https://www.amazon.in/");
		
		//Browser Commands
		System.out.println("Title was "+webDriver.getTitle());
		System.out.println("CurrentURL was "+webDriver.getCurrentUrl());
		//System.out.println("PageSource was "+webDriver.getPageSource());
		
		//Navigational Commands
		System.out.println("Going to click Todays Deals");
		webDriver.findElement(By.linkText("Today's Deals")).click();
		
		WebElement searchBox= webDriver.findElement(By.name("field-keywords"));
		//Click on the searchBox
		searchBox.click();
		searchBox.sendKeys("Samsung Phones");
		
	WebElement searchButton= webDriver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input") );
//		//Click on the searchBox
	searchButton.click();
	
	}
	
}
