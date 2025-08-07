package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_xpathBygroupindexing {

	public static void main(String[] args) throws InterruptedException {
		//Lunch the Browser
				WebDriver driver= new ChromeDriver();
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//Navigate to an appln
				driver.get("https://www.facebook.com/");
				
				//Identify user name  text field
				driver.findElement(By.xpath("//input[3]")).sendKeys("selenium");
				
				Thread.sleep(3000);
				
				//Identify pswd text field
				driver.findElement(By.xpath("//input[4]")).sendKeys("abc123");
				Thread.sleep(3000);
				
				//identify  the login button
				driver.findElement(By.xpath("//button")).click();
				Thread.sleep(3000);
				
				//close the Browser
				driver.quit();
	}

}

