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

public class ProjActivity_5 
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
	  //My Account &#8211; Alchemy LMS
	  title = driver.getTitle();
	  System.out.println(title);
	  
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


