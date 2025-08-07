package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_IndependentAndDependentxpath {

	
	public static void main(String[] args) throws InterruptedException {

		//Lunch the Browser
		WebDriver driver= new ChromeDriver();
				
		//Maximize the window
		driver.manage().window().maximize();
		
		//Navigate to an appln
		driver.get("https://www.flipkart.com/");
				

		//Identify user name  text field
		driver.findElement(By.name("q")).sendKeys("toys"+Keys.ENTER);
		
	 //Identify pswd text field
		WebElement dynamic_ele = driver.findElement(By.xpath("//a[contains(text(),'GAMLOID')]/../a[@class=\"DMMoT0\"]"
				+ "/div/div[@class=\"Nx9bqj\"]"));
		Thread.sleep(3000);
		{
			System.out.println(dynamic_ele.getText());
		}
				//close the Browser
				driver.quit();
	}

}

