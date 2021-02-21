package Selenium_project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ProjcActivity_8 
{
  WebDriver driver;
  String title;
  int number=1;
  
	@Test
  public void f() 
  {
	  
	  System.out.println("Inside function");
	  WebElement navigator = driver.findElement(By.id("site-navigation"));
	  Assert.assertTrue(navigator.isDisplayed());
	  driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[4]/a")).click();
	  title = driver.getTitle();
	  System.out.println(title);
	  WebElement FN = driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_0\"]"));
	  WebElement EM = driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_1\"]"));
	  WebElement Sub = driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_3\"]"));
	  WebElement Com = driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_2\"]"));
	  
	  FN.sendKeys("Donald Trump");
	  EM.sendKeys("xyz@abc.com");
	  Sub.sendKeys("Nothing");
	  Com.sendKeys("Everything");
	  
	  
	  
	  driver.findElement(By.xpath("//*[@id=\"wpforms-submit-8\"]")).click();
	  String reader = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div[2]/div[2]/div[2]/p")).getText();
	  System.out.print(reader);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("Inside before method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("Inside after method");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("Inside before class");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("Inside after class");
	 if (title.equals("My Account – Alchemy LMS"))
		  driver.close();
	else
		System.out.println("Go gone");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Inside before test");
	  driver = new FirefoxDriver();
	  driver.get("https://alchemy.hguy.co/lms/");
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("Inside after test");
  }
  
  
  
  }


