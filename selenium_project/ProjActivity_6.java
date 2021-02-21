package Selenium_project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ProjActivity_6 
{
  WebDriver driver;
  String title;
  
  
	@Test
  public void f() 
  {
	  
	  System.out.println("Inside function");
	  WebElement navigator = driver.findElement(By.id("site-navigation"));
	  Assert.assertTrue(navigator.isDisplayed());
	  driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div/div[3]/div/nav/div/ul/li[5]/a")).click();
	  title = driver.getTitle();
	  System.out.println(title);
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/section[2]/div[2]/div[2]/div[2]/div[2]/a")).click();
	  title = driver.getTitle();
	  WebElement un = driver.findElement(By.xpath("//*[@id=\"user_login\"]"));
	  WebElement pwd = driver.findElement(By.xpath("//*[@id=\"user_pass\"]"));
	  
	  un.sendKeys("root");
	  pwd.sendKeys("pa$$w0rd");
	  
	  driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
	  
	  driver.findElement(By.xpath("/html/body/div[2]/div/ul[2]/li[2]/a"));
	  
	  
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


