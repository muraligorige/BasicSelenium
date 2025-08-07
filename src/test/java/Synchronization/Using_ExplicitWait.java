package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Using_ExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Implicit Wait
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	     
	     //Navigate to an appln
	     driver.get("https://shoppersstack.com/");
	     

			//Identify the button and click
			WebElement login=driver.findElement(By.id("loginBtn"));
			
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(login));
			
			login.click();
			
			//Explict wait using title conditions method
			wait.until(ExpectedConditions.titleContains("ShoppersStack | Login"));
			
			driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("abc123");
			Thread.sleep(3000);
			WebElement log_in=driver.findElement(By.className("MuiButton-label"));
			
			wait.until(ExpectedConditions.elementToBeClickable(log_in));
			log_in.click();
			Thread.sleep(3000);
			
			//Close the Browser
			driver.quit();
			
	}

}

