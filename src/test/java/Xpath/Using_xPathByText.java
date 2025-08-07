package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_xPathByText {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver= new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to an apply
		driver.get("https://www.facebook.com");
		
		//identify create new account button and click
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		
		//identify already haven account 
		driver.findElement(By.xpath("//a[.=\"Already have an account?\"]")).click();
		
		 Thread.sleep(3000);
		 
		 //close the window
		 driver.quit();

	}
}
