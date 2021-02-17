package Selenium_project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ProjActivity_3
{
	  WebDriver driver;
	  String header;
		@Test
	  public void f() 
	  {
			
			header = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div[1]/div[2]/div/div/div/div/div[2]/h3")).getText();
			System.out.println(header);
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
		  if (header.equals("Actionable Training"))
			  driver.quit();
		  else
			  System.out.println("Something is fishy");
	  }

}
