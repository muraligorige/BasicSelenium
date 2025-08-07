package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_xPath {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver= new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://www.flipkart.com");
		
		//identify by using XPath
		driver.findElement(By.xpath("(//a[ @ title=\"Login\"])[1]")).click();
		
		
		 Thread.sleep(3000);
		 
		 //close the window
		 driver.quit();
	}

}
