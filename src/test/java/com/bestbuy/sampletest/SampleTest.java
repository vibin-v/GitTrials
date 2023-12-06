package com.bestbuy.sampletest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest
{
	@Test
	public void test1()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bestbuy.com/");
		
		String actualPageTitle = driver.getTitle();
		
		Assert.assertTrue(actualPageTitle.equalsIgnoreCase("Best Buy International: Select your Country - Best Buy"));
		
		Reporter.log("Thats cool!!!Page title is : "+actualPageTitle,true);
		
		driver.quit();

	}
	@Test
	public void test2()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bestbuy.com/");
		
		String actualPageTitle = driver.getTitle();
		
		Assert.assertTrue(actualPageTitle.equalsIgnoreCase("Best Buy International: Select your Country - Best Buy"));
		
		Reporter.log("Thats cool!!!Page title is : "+actualPageTitle,true);
		
		driver.quit();

	}
	public void test3()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bestbuy.com/");
		
		String actualPageTitle = driver.getTitle();
		
		Assert.assertTrue(actualPageTitle.equalsIgnoreCase("Best Buy International: Select your Country - Best Buy"));
		
		Reporter.log("Thats cool!!!Page title is : "+actualPageTitle,true);
		
		driver.quit();

	}
	public void test4()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bestbuy.com/");
		
		String actualPageTitle = driver.getTitle();
		
		Assert.assertTrue(actualPageTitle.equalsIgnoreCase("Best Buy International: Select your Country - Best Buy"));
		
		Reporter.log("Thats cool!!!Page title is : "+actualPageTitle,true);
		
		driver.quit();

	}
	
	public void test5()
	{
		//abcccc
		
	}
	public void test6()
	{
		//abcccc
		
	}
	}
}
