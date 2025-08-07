package ActionClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_ClickAndHoldAction {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		 WebDriver driver = new ChromeDriver();
		 
		 //maximize the window
		 driver.manage().window().maximize();
		 
		 //implict wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 //navigate to an application
		 driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		 
		 //Find Circle Id
		 WebElement element=driver.findElement(By.id("circle"));
		 
		 Actions actions=new Actions(driver);
		 actions.clickAndHold(element).perform();
		 
		 Thread.sleep(10000);
		 
		 actions.release(element).perform();
		   
		  Thread.sleep(5000);
		  
		  //close the driver
		  driver.quit();
		 
		

	}

}
