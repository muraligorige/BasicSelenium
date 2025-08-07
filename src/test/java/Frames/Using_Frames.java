package Frames;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Frames {

	public static void main(String[] args) throws InterruptedException {

		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		driver.get("https://www.zomato.com/india");
		
		driver.findElement(By.linkText("Log in")).click();
		
		Thread.sleep(3000);
		
		//switch the driver control to form
		driver.switchTo().frame("auth-login-ui");
		
		//identify MNO TF
		driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("9012093452");
		
		//identify cross btn and click
		driver.findElement(By.xpath("//i[@aria-label=\"close Modal\"]")).click();
		
		//switch driver control to main webpage
		driver.switchTo().defaultContent();
		
		//identify Sign up TF
		driver.findElement(By.linkText("Sign up")).click();
		
		//close the driver
		driver.quit();
		
	}

}