package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_ImplictWait {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Implicit Wait
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//Navigate to an appln
		
		//Thread.sleep(50000);		
	     driver.get("https://shoppersstack.com//");

		
		//Identify the button and click
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(3000);
		
		//close the Browser
		driver.quit();
	}

	}

