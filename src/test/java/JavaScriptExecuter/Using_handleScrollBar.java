package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_handleScrollBar {
	
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		driver.get("https://www.swiggy.com/restaurants");
		
		//scroll the webpage using hardcoded-cordinates
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("window.scrollBy(100,1000)");
		
		Thread.sleep(3000);
		
		//scroll the webpage using element referenece
		WebElement ele = driver.findElement(By.xpath("//h2[ text()='Best Places to Eat Across Cities']"));
		executor.executeScript("arguments[0].scrollIntoView(true)", ele);
		
		Thread.sleep(3000);
		
		//scroll the webpage using element coordinates
		int xaxis=ele.getLocation().getX();
		int yaxis=ele.getLocation().getY();
		
		executor.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		
		Thread.sleep(3000);
		
		//scroll till bottom of the webpage
		executor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(3000);
		
		//scroll till top of the webpage
		executor.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		Thread.sleep(3000);	
			
		//close the window
		driver.quit();
			
	}
    
}
