package Selenium_project;

import org.testng.annotations.Test;

import org.testng.annotations.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ProjActivity_2 
{
  WebDriver driver;
  String header;
	@Test
  public void f() 
  {
		
		header = driver.findElement(By.className("uagb-ifb-title")).getText();
		
	//String subHeading = driver.findElement(By.className("sub")).getText();
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
  }

  @BeforeClass
  public void beforeClass() 
  {
	  driver = new FirefoxDriver();
      
	  driver.get("https://alchemy.hguy.co/lms/");

  }

  @AfterClass
  public void afterClass() 
  {
	  if (header == "Learn from Industry Experts")
		  driver.quit();
	  
  }

}
