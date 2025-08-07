package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_XpathHandlingSvgTags {

	public static void main(String[] args) throws InterruptedException {
		
		//Lunch the Browser
		WebDriver driver= new ChromeDriver();
				
		//Maximize the window
		driver.manage().window().maximize();
		
		
		//Navigate to an application
		driver.get("https://www.flipkart.com/");
		
		//identify the search textfield in flipkart
		driver.findElement(By.name("q")).sendKeys("toys");
		
		//identify search icon/button and click
		driver.findElement(By.xpath("//*[name()='svg'][@ width=\"24\"]")).click();
		
		Thread.sleep(4000);
		
		
		//close the browser
		driver.quit();
		

	}

}
