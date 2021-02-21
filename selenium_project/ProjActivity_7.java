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

public class ProjActivity_7 
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
	  
	  List<WebElement> courses = driver.findElements(By.className("entry-title"));
	  System.out.println("Number of courses offered by Alchemy today are : " + courses.size());
	  
	  for (int noti=0;noti<courses.size();noti++)
	  {
		  System.out.println("Course Title : " + courses.get(noti).getText());
	  }
	  /*while (driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div/div/div/div[1]/article/div[2]/h3")) != null)
	  {
		  title = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div/div/div/div[1]/article/div[2]/h3")).getText();
		  System.out.println("Course Name  : " + number + " : " + title);
		  number = number + 1;		  
		  
	  }*/
	  System.out.print("Number of courses today : " + number);
	  
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


