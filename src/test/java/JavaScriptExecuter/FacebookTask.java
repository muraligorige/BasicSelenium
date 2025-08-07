package JavaScriptExecuter;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask {

	public static void main(String[] args) throws InterruptedException {
	
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		driver.get("https://www.facebook.com");
		
		//identify UN TF
		WebElement un=driver.findElement(By.id("email"));
		
		//pass the code using JSE
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].value=arguments[1]", un,"9121041536");
		
		//identify PSWD TF
		WebElement pswd=driver.findElement(By.id("pass"));
		
		//pass the code using JSE
		executor.executeScript("arguments[0].value=arguments[1]", pswd,"murali@123"); 
		
		//click on apply button
		WebElement btn=driver.findElement(By.name("login"));
		executor.executeScript("arguments[0].click()", btn);
		
		Thread.sleep(3000);
		
		//close the driver
		driver.quit();	
		
	}

}