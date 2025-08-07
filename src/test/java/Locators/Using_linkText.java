package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_linkText {
	
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver= new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://www.facebook.com");
		
		// identify forgotten password
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		 Thread.sleep(3000);
		 
		 //close the window
		 driver.quit();
		
		
		
		
	}

}
