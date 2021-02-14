import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Activity4_2 {

	public static void main(String[] args) 
	{
		WebDriver ffDriver = new FirefoxDriver();
		ffDriver.get(" https://www.training-support.net/selenium/simple-form");
		String PageTitle = ffDriver.getTitle();
		System.out.println("Title of the page is : " + PageTitle);
		
        WebElement firstName = ffDriver.findElement(By.xpath("//input[@id = 'firstName']"));
        WebElement lastName = ffDriver.findElement(By.xpath("//input[@id = 'lastName']"));
 
        firstName.sendKeys("Sreevara");
        lastName.sendKeys("Mysore");
 
        ffDriver.findElement(By.xpath("//input[@id = 'email']")).clear();
        ffDriver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("Sreevara.Mysore@sprint.com");
 
        ffDriver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("9448488175");
 
        ffDriver.findElement(By.xpath("//textarea")).sendKeys("This is not my message");
 
        ffDriver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
		
		

	}

}
