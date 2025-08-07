package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_ClickOnElement {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		driver.get("https://www.flipkart.com");
		
		WebElement searchTF = driver.findElement(By.name("q"));
		
		//pass the code using JSE
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].value=arguments[1]", searchTF,"mobiles");
		
		Thread.sleep(3000);
		
		//click on an element
		WebElement searchbtn = driver.findElement(By.xpath("//a[@title=\"Cart\"]"));
		executor.executeScript("arguments[0].click()", searchbtn);
		
		//close the driver
		driver.quit();
	}

}
