package testNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Activity2 
{
  WebDriver driver;
  
  @Test
  public void TC1()
  {
	//This test case will pass
    String title = driver.getTitle();
    System.out.println("Title is: " + title);
    Assert.assertEquals(title, "Target Practice");  
	
  }
  
  @Test
  public void TC2 ()
  {
	  	WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
	    Assert.assertTrue(blackButton.isDisplayed());
	    Assert.assertEquals(blackButton.getText(), "black");
  }
  
  @Test (enabled = false)
  public void TC3 ()
  {
      //This test will be skipped and not counted
      String subHeading = driver.findElement(By.className("sub")).getText();
      Assert.assertTrue(subHeading.contains("Practice"));
  }
  
  @Test
  public void TC4 ()
  {
	  //This test will be skipped and will be be shown as skipped
      throw new SkipException("Skipping test case"); 
  }
  @BeforeTest
  public void beforeMethod()
  {
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/target-practice");
  }

  @AfterTest
  public void afterMethod() 
  {
		
      //Close the browser
      driver.close();
  }

}
