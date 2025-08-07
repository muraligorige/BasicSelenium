package WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebELementsMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
		//launch the browser
		WebDriver driver= new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to an apply
		driver.get("https://demowebshop.tricentis.com/");
		
		//identify TF 
		 WebElement ele = driver.findElement(By.id("small-searchterms"));
		 ele.click();
		 ele.sendKeys("Laptops");
//		 ele.clear();
		 ele.submit();
		 
		 //identify an ele
		 ele=driver.findElement(By.xpath("//a[@ class=\"ico-register\"]"));
		
		 
		 Thread.sleep(8000);
		 
		 //close the window
		 driver.quit();
	

	}

}
