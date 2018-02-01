package com.main;

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
		
		WebDriver webDriver = myPageRef.getDriverHandle("D:\\Praveen\\Dynamic_2\\WebContent\\index.html");
		

		
	WebElement searchBox= webDriver.findElement(By.name("username") );
	searchBox.click();
	searchBox.sendKeys("username");
	WebElement searchBox1= webDriver.findElement(By.name("pass") );
	searchBox1.click();
	searchBox1.sendKeys("pass");
	WebElement searchBox2= webDriver.findElement(By.xpath("/html/body/form/a"));
	searchBox2.click();
	}
	
}
