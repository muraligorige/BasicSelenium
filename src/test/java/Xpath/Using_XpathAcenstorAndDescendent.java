package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Using_XpathAcenstorAndDescendent {

	public static void main(String[] args) {
		

		//Lunch the Browser
		WebDriver driver= new EdgeDriver();
				
		//Maximize the window
		driver.manage().window().maximize();
		
		//Navigate to an appln
		driver.get("https://www.amazon.in/");
		
		//identify the element in amazon by using Acenstor and descendent
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops"+Keys.ENTER);
		
		WebElement price = driver.findElement(By.xpath("//span[contains(text(),'ASUS Vivobook 16X')]/ancestor::div[contains(@ class,\"a-section a-spacing-s\")]/descendant::span[@class=\"a-price-whole\"]"));

			System.out.println(price.getText());
			
			//close the driver
			driver.quit();
			
			
			//using following sibling and preceding sibling axes
			//link/following-sibling::link/following-sibling::script/
			//preceding-sibling::meta
	}

}
