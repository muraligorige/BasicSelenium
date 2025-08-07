package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_cssSelector {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver= new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://www.flipkart.com");
		
		//identifying login and click on it
		driver.findElement(By.cssSelector("img[alt=\"Login\"]")).click();
		
		//identift TF and enter mno
		driver.findElement(By.cssSelector("input[class=\"r4vIwl BV+Dqf\"]")).sendKeys("9121041536");
		
		//click on request OTP button
		driver.findElement(By.cssSelector("button[class=\"QqFHMw twnTnD _7Pd1Fp\"]")).click();
		
		 Thread.sleep(3000);
		 
		 //close the window
		 driver.quit();
		

	}

}
