package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://www.facebook.com");
		
		//identify UN text field
		WebElement un=driver.findElement(By.id("email"));
		un.sendKeys("murali kuruma");
		
		//identify password text field
		WebElement pswd=driver.findElement(By.id("pass"));
		pswd.sendKeys("Murali@123");
		
		//identify login button
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
		
	}
}
