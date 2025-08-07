package RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Using_RelativeLocators {

	public static void main(String[] args) throws InterruptedException {
	
		//launch the browser
		WebDriver driver= new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to an apply
		driver.get("https://www.facebook.com");
		
		//identify password textfield
		WebElement pswd = driver.findElement(By.id("pass"));
		
		//identify UN TF
		WebElement un = driver.findElement(RelativeLocator.with(By.tagName("input")).above(pswd));
		un.sendKeys("selenium");
		
		pswd.sendKeys("abc@123");
		
		//identify login btn
		driver.findElement(RelativeLocator.with(By.tagName("button")).below(pswd)).click();
		
		 Thread.sleep(3000);
		 
		 //close the window
		 driver.quit();
		 
		 //syntax for relativelocators
		 //WE UN=DRIVER.FE(RL.WITH(BY.LOCATORS("VAL").ABOVE(PSWD);

	}

}
