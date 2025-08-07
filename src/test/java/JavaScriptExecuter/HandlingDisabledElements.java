package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElements {

	public static void main(String[] args) throws InterruptedException {

		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		driver.get("http://127.0.0.1:5500/WebTechnology/web-tec/html/ASSIGNMENT/selenium.html");
		
		WebElement un = driver.findElement(By.id("user"));

		//Handling disabled TF
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].value=arguments[1]", un,"murali");
		
		Thread.sleep(3000);
		
		//Handling disabled button
		WebElement btn=driver.findElement(By.id("login"));
		executor.executeScript("arguments[0].disabled=false", btn);
		btn.click();
		
		Thread.sleep(3000);
		
		//close the driver
		driver.quit();

	}

}
