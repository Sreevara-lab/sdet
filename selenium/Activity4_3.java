import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Activity4_3 {

	public static void main(String[] args)
	{
		WebDriver ffDriver = new FirefoxDriver();
		ffDriver.get("https://www.training-support.net/selenium/target-practice");
		String PageTitle = ffDriver.getTitle();
		System.out.println("Title of the page is : " + PageTitle);
		
		String thirdHeader = ffDriver.findElement(By.xpath("//h3[@id='third-header']")).getText();
	    System.out.println("Third header text is: " + thirdHeader);
	 
        String fifthHeaderColour = ffDriver.findElement(By.xpath("//h5")).getCssValue("color");
	    System.out.println("Fith header's colour is: " + fifthHeaderColour);
	 
	    String violetButtonClasses = ffDriver.findElement(By.xpath("//button[contains(text(), 'Violet')]")).getAttribute("class");
	    System.out.println("Violet button's classes are: " + violetButtonClasses);
	 
	    //Find the grey button with Absolute XPath
	    String greyButton = ffDriver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
	    System.out.println("The grey button's text is: " + greyButton);
	 
	    //ffDriver.close();
	 
		

	}

}
