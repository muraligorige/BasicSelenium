package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTitleAndUrl {

	public static void main(String[] args) throws InterruptedException {
	
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		driver.get("https://www.facebook.com");
		
		//Fetch title
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		System.out.println(executor.executeScript("return document.title"));
		
		Thread.sleep(3000);
		
		//Fetch the url
		System.out.println(executor.executeScript("return document.URL"));
		
		Thread.sleep(3000);
		
		//fresh the url
		executor.executeScript("history.go(0)");
		
		Thread.sleep(3000);
		
		//close the driver
		driver.quit();

	}

}
