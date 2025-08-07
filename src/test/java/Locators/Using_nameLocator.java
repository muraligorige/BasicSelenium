package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_nameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://www.facebook.com");
		
		//identify UserName textfield
		driver.findElement(By.name("email")).sendKeys("murali");
		
		//identify password text field
		driver.findElement(By.name("pass")).sendKeys("murali@123");
		
		//identify login button
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();

	}

}
