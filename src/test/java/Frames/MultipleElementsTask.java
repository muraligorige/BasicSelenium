package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsTask {

	public static void main(String[] args) throws InterruptedException {

		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an  application
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		
		//signup application
		WebElement sign_up = driver.findElement(By.xpath("(//div[@ class=\"w-1/2\"])[1]"));
		driver.switchTo().frame(0);

		//sign up
		driver.findElement(By.id("email")).sendKeys("murali123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("murali@123");
		driver.findElement(By.id("confirm-password")).sendKeys("murali@123");
		driver.findElement(By.id("submitButton")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		//login application
		WebElement login =driver.findElement(By.xpath("(//div[@ class=\"w-1/2\"])[2]"));
		driver.switchTo().frame(1);
		
		//login 
		driver.findElement(By.id("username")).sendKeys("murali");
		driver.findElement(By.id("password")).sendKeys("malaadugu");
		driver.findElement(By.id("submitButton")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		//close the driver
		driver.quit();

	}

}