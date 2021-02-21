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

public class ProjActivity_9 
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
	  driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[2]/a")).click();
	  title = driver.getTitle();
	  System.out.println(title);
	  
	  WebElement Course = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div/div/div/div[1]/article/div[2]/h3"));
	  String CourseTitle = Course.getText() + " – Alchemy LMS";
	  //Getting the course title mentioned in first course
	  System.out.println(CourseTitle);
	  //Clicking on the first image
	  driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div/div/div/div[1]/article/a/img")).click();
	  System.out.println(driver.getTitle());
	  
	  //
	  if(driver.getTitle() == CourseTitle)
	  {
		  System.out.println("You Clicked correct link");
	  }
	  else
	  {
		  System.out.println("You Clicked on something else");
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/main/article/div/div/div/div/div[1]/div[3]/div/div/a")).click();
		  
		  WebElement UN = driver.findElement(By.xpath("//*[@id=\"user_login\"]"));
		  WebElement PW = driver.findElement(By.xpath("//*[@id=\"user_pass\"]"));
		  
		  UN.sendKeys("root");
		  PW.sendKeys("pa$$w0rd");
		  
		  driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
		  
		  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/div/div/div/div[3]/div[2]/div[1]/div[1]/a/div[2]")).click();
		  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[4]/div[2]/a/span[1]")).click();
		  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[4]/div[2]/form/input[4]")).click();
		  
	  }
	  
	  	  
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


