package Selenium_project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import javax.sound.sampled.AudioSystem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ProjActivity_4 
{
  String popular;
  WebDriver driver;
	@Test
  public void f() 
  {
		popular = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div/div[2]/div/div/div/div[2]/article/div[2]/h3")).getText();
		System.out.println(popular);
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
	  if (popular.equals("Email Marketing Strategies"))
		  driver.close();
	  else
		  System.out.println("Some other course");
  }

  @BeforeTest
  public void beforeTest() 
  {
  }

  @AfterTest
  public void afterTest() 
  {
  }

}
