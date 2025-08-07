package ActionClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_MouseOver {

	public static void main(String[] args) throws InterruptedException {


		//launch the browser
		 WebDriver driver = new ChromeDriver();
		 
		 //maximize the window
		 driver.manage().window().maximize();
		 
		 //implict wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 //navigate to an application
		 driver.get("https://www.ajio.com/");
		 
		 //identify the elements
		WebElement mens=driver.findElement(By.linkText("MEN"));
		 
		 //mouse over on the element
		 Actions actions= new Actions(driver);
		 actions.moveToElement(mens).perform();
		   
		  Thread.sleep(5000);
		  
		  //close the driver
		  driver.quit();
		 
		

	}

}
