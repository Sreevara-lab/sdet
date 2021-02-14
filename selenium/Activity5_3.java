import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Activity5_3 
{

	public static void main(String[] args) 
	{
		WebDriver ffDriver = new FirefoxDriver();
		boolean crosschecker;
		ffDriver.get("https://training-support.net/selenium/dynamic-controls");
		String PageTitle = ffDriver.getTitle();
		System.out.println("Title of the page is : " + PageTitle);
		
		WebElement textElement = ffDriver.findElement(By.xpath("//input[@type='text']"));
		
		System.out.println("The text box is enabled : " + textElement.isEnabled());
		ffDriver.findElement(By.id("toggleInput")).click();
		System.out.println("The text box is enabled : " + textElement.isEnabled());
		
		
		
	}

}
