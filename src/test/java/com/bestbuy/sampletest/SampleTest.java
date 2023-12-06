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
	public void testPageTitle()
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
	public void test02()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bestbuy.com/");
		
		WebElement labelText = driver.findElement(By.xpath("//div[text()='Hello!']"));
		
		Assert.assertTrue(labelText.isDisplayed());
		Reporter.log("Thats cool!!!");
		
		driver.quit();

	}
	@Test
	public void test03()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bestbuy.com/");
		
		WebElement labelText = driver.findElement(By.xpath("//div[text()='Hello!']"));
		
		Assert.assertTrue(labelText.isDisplayed());
		Reporter.log("Thats cool!!!");
		
		driver.quit();

	}
	@Test
	public void test04()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bestbuy.com/");
		
		WebElement labelText = driver.findElement(By.xpath("//div[text()='Hello!']"));
		
		Assert.assertTrue(labelText.isDisplayed());
		Reporter.log("Thats cool!!!");
		
		driver.quit();

	}
	@Test
	public void test05()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bestbuy.com/");
		
		WebElement labelText = driver.findElement(By.xpath("//div[text()='Hello!']"));
		
		Assert.assertTrue(labelText.isDisplayed());
		Reporter.log("Thats cool!!!");
		
		driver.quit();

	}

}
