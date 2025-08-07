package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_xpathGroupindexing2 {

	public static void main(String[] args) throws InterruptedException {

		//Lunch the Browser
		WebDriver driver= new ChromeDriver();
						
		//Maximize the window
		driver.manage().window().maximize();
						
		//Navigate to an appln
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(3000);
		
		//Identify quick start link and click
		driver.findElement(By.xpath("//button[@data-aos=\"fade-up\"]")).click();
		Thread.sleep(3000);
						
		//Identify name text field and enter value
		driver.findElement(By.xpath("//input[@type=\"text\"][1]")).sendKeys("Murali");
		
		//Identify mail id text field and enter value
						
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("muraligorige816@gmail.com");
		
		//Identify password text field and enter password
						
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Murali@123S");
						
        //Identify register button and click on it
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
						
		Thread.sleep(3000);			
						
		//close the Browser
		driver.quit();
					

			

		

	}

}

