package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Navigate {


		public static void main(String[] args) throws InterruptedException {
		
			//launch the browser
			WebDriver driver=new ChromeDriver();
			
			//maximize the window
			driver.manage().window().maximize();
			
			//implict wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//navigate to an application
			String url="https://www.facebook.com";
			
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("window.location=arguments[0]", url);
			
			Thread.sleep(3000);
			
			//close the driver
			driver.quit();	
			
		}

	}


