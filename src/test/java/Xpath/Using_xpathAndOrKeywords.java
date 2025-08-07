package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_xpathAndOrKeywords {

	public static void main(String[] args) throws InterruptedException {
		
		//Lunch the Browser
		WebDriver driver= new ChromeDriver();
				
		//Maximize the window
		driver.manage().window().maximize();
		
		//Navigate to an application
		driver.get("https://www.facebook.com/");
		
		//identify UN TF By using And
		driver.findElement(By.xpath("//input[@type=\"text\" and name=\"email\"]")).sendKeys("murali");
		
		
		//identify using OR OPerator
		driver.findElement(By.xpath("//input[@type=\"password\" or data-testid=\"royal-pass\"]")).sendKeys("murali@12345678");
		
		//identify using and operator
		
		driver.findElement(By.xpath("//button[contains(@type,'su') and text()='login']")).click();
		

			Thread.sleep(3000);
			
			//close the driver
			driver.quit();
	}

}
