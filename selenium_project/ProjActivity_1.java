package Selenium_project;

import org.testng.annotations.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

@Test
public class ProjActivity_1 
{
	WebDriver driver;
	boolean matcher;
	String title;
  public void TitleChecker () 
  {
	  title = driver.getTitle();
	  
      
      System.out.println("Page title is: " + title);
     // matcher = Assert.assertEquals("Alchemy LMS – An LMS Application", title);
  }  
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver = new FirefoxDriver();
	        
	  driver.get("https://alchemy.hguy.co/lms/");

  }

  @AfterMethod
  public void afterMethod() 
  {
	  if (title == "Alchemy LMS – An LMS Application")
	  driver.quit();
  }

}
