package ActionClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingRightClickButton {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implict to wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightclictbtn=driver.findElement(By.xpath("//span[text()='right click me']"));

			Actions actions=new Actions(driver);
			actions.contextClick(rightclictbtn).perform();
			
			Thread.sleep(3000);
			
			//refresh the webpage
			driver.navigate().refresh();
			
			//identify Double click button
			WebElement element=driver.findElement(By.xpath("//button"));
			
			//perform double click
			actions.doubleClick(element).perform();
			
			Thread.sleep(3000);
			
			//close the driver
			driver.quit();
	}

}
