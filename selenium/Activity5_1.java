import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Activity5_1 {

	public static void main(String[] args) 
	{

		WebDriver ffDriver = new FirefoxDriver();
		ffDriver.get("https://training-support.net/selenium/dynamic-controls");
		String PageTitle = ffDriver.getTitle();
		System.out.println("Title of the page is : " + PageTitle);
		
		WebElement checkboxInput = ffDriver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("The checkbox Input is displayed: " + checkboxInput.isDisplayed());
 
        ffDriver.findElement(By.id("toggleCheckbox")).click();
 
        System.out.println("The checkbox Input is displayed: " + checkboxInput.isDisplayed());
 
        //Close the browser
        //ffDriver.close();
		
	}

}
