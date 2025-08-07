package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Using_FluentWait {

	public static void main(String[] args) {

		//launch the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		//fluent wait
		FluentWait<WebDriver> fluentWait= new FluentWait<WebDriver>(driver);
		//mentioning time duration to wait
		fluentWait.withTimeout(Duration.ofSeconds(10));
		//customizing the polling period
		fluentWait.pollingEvery(Duration.ofSeconds(1));
		//ignore the exception
		fluentWait.ignoring(Exception.class);
		
		//identify UN TF
		WebElement email=driver.findElement(By.id("email"));
		
		//condition
		fluentWait.until(ExpectedConditions.visibilityOf(email));
		
		email.sendKeys("murali");
		
		driver.close();
	}

}
