package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_xPathContains {

	public static void main(String[] args) throws InterruptedException {

		//launch the browser
		WebDriver driver= new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to an apply
		driver.get("https://demowebshop.tricentis.com");
		
		//identify to register an application
		driver.findElement(By.xpath("//a[contains(@class,'ico-register')]")).click();
		
		//click on gender
		driver.findElement(By.xpath("//input[contains(@id,'gender-male')]")).click();
		
		//Enter FirstName in FN TF
		driver.findElement(By.xpath("//input[contains(@ id,'FirstName')]")).sendKeys("GORIGE");
		
		//Enter SecondName in SN TF
		driver.findElement(By.xpath("//input[contains(@id,'LastName')]")).sendKeys("MURALI");
		
		//Enter Email in EMail TF
		driver.findElement(By.xpath("//input[contains(@id,'Email')]")).sendKeys("muraligorige816@gmail.com");
		
		//Enter PSWD in PSWD TF
		driver.findElement(By.xpath("//input[contains(@ id,'Password')]")).sendKeys("M@1234");
		
		//Enter CPSWD in CPSWD TF
		driver.findElement(By.xpath("//input[contains(@ id,'ConfirmPassword')]")).sendKeys("M@1234");
		
		//click on register button
		driver.findElement(By.xpath("//input[contains(@ id,'register-button')]")).click();
		
		Thread.sleep(3000);
		 
		 //close the window
		 driver.quit();

	}

}
