
package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_classNameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://www.facebook.com");
		
		//identify UserName textfield
		 WebElement un=driver.findElement(By.className("_55r1"));
		 un.sendKeys("murali");
		
		//identify password text field
		//here we can give full of url or we can take some unique values in between
		driver.findElement(By.className("_9npi")).sendKeys("murali@123");
		
		//identify login button
		driver.findElement(By.className("_42ft")).click();
		
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();

	}

}

