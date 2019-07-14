package com.jenkins.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestScript {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Jars\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.crmpro.com");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	@Test
	public void login() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("nkesav");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("kavish@123");
		WebElement ele = driver.findElement(By.xpath("//input[@type='submit']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver; // down casting
		js.executeScript("arguments[0].click();",ele);
	
	}
	
				
		

	

}

