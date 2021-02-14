import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Activity4_1 {

	public static void main(String[] args) 
	{
		WebDriver ffDriver = new FirefoxDriver();
		ffDriver.get("https://www.training-support.net");
		String PageTitle = ffDriver.getTitle();
		System.out.println("Title of the page is : " + PageTitle);
		
		ffDriver.findElement(By.xpath("html/body/div/div/div/a")).click();
		PageTitle = ffDriver.getTitle();
		System.out.print("Now the title is : " + PageTitle);
		ffDriver.close();


	}

}
