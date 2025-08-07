package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_tagName {

	public static void main(String[] args) throws InterruptedException {

		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get("https://www.facebook.com");
		
		//identify A tag
		 List<WebElement> list=driver.findElements(By.tagName("a"));
		 
		 //fetch all the tags
		 for (WebElement webElement : list) {
			 System.out.println(webElement.getText());
			
		}
		 
		 Thread.sleep(3000);
		 
		 //close the window
		 driver.quit();
		

	}

}
