package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_xPathByAttribute {

	public static void main(String[] args) throws InterruptedException {
	
		//launch the browser
		WebDriver driver= new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to an apply
		driver.get("https://www.facebook.com");
		
		//identify UN TF and pass the text
		driver.findElement(By.xpath("//input[@aria-label=\"Email address or phone number\"]")).sendKeys("murali");
		
		//identify PSWD TF and pass the text
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("nencheppanu@123");
		
		
		//identify login button and click
		driver.findElement(By.xpath("//button[@data-testid=\"royal-login-button\"]")).click();
		
		
		 Thread.sleep(3000);
		 
		 //close the window
		 driver.quit();
		

	}

}
