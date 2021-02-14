import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Activity_3 {

	public static void main(String[] args) 
	{
	
		WebDriver ffDriver = new FirefoxDriver();
		ffDriver.get("https://training-support.net/selenium/simple-form");
		String PageTitle = ffDriver.getTitle();
		System.out.println("Title of the page is : " + PageTitle);
		
		WebElement firstName = ffDriver.findElement(By.id("firstName"));
		WebElement lastName = ffDriver.findElement(By.id("lastName"));
		
		firstName.sendKeys("Sreevara");
		lastName.sendKeys("Mysore");
		
		ffDriver.findElement(By.id("email")).sendKeys("mynasri@gmail.com");
		ffDriver.findElement(By.id("number")).sendKeys("91448488175");

		ffDriver.findElement(By.cssSelector(".ui.green.button")).click();
		
		ffDriver.close();
	}

}
