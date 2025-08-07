package ActionClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Keyboard {

	public static void main(String[] args) throws InterruptedException {
		
		
		//launch the browser
		 WebDriver driver = new ChromeDriver();
		 
		 //maximize the window
		 driver.manage().window().maximize();
		 
		 //implict wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 //navigate to an application
		 driver.get("https://www.flipkart.com/");
		 WebElement element=driver.findElement(By.name("q"));
		 
		 Actions actions=new Actions(driver);
		 actions.moveToElement(element).click(element).sendKeys("mobiles")
		 .keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		 
		 Thread.sleep(5000);
		 
		 //close the browser
		 driver.quit();
		
	}

}
