package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_XapthStartsWith {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver= new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to an apply
		driver.get("https://www.facebook.com");
		
		//identify UN TF
		driver.findElement(By.xpath("//input[starts-with(@id,'em')]")).sendKeys("9121041536");
		
		//identify PSWD TF
		driver.findElement(By.xpath("//input[starts-with(@id,'p')]")).sendKeys("Murali@666");
		
		//identify an login by using Starts-With
		driver.findElement(By.xpath("//button[starts-with(@class,'_42ft')]")).click();
		
		 Thread.sleep(3000);
		 
		 //close the window
		 driver.quit();

	}

}
