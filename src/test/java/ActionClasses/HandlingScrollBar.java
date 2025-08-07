package ActionClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingScrollBar {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implict to wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		driver.get("https://www.amazon.in/");
		
		//scroll the webpage based on X and Y coordinates
		Actions actions= new Actions(driver);
		actions.scrollByAmount(60, 200).perform();
		
		Thread.sleep(3000);
		
		//identify element and scroll the webpage based on the element
		 WebElement backtotop=driver.findElement(By.xpath("//span[contains(text(),'Back to top')]"));
		 actions.scrollToElement(backtotop);
		 
		 Thread.sleep(3000);
		
		//close the window
		driver.quit();

	}

}
