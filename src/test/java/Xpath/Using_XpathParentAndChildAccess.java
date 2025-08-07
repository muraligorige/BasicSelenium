package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_XpathParentAndChildAccess {

	public static void main(String[] args) throws InterruptedException {


		//Lunch the Browser
		WebDriver driver= new ChromeDriver();
				
		//Maximize the window
		driver.manage().window().maximize();
		
		//Navigate to an appln
		driver.get("https://www.amazon.in/");
		
		//identify the element in amazon by using parent and child
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile"+Keys.ENTER);
		
		WebElement price = driver.findElement(By.xpath("//span[contains(text(),'Samsung Galaxy M05')]/parent::h2/parent::a/parent::div/parent::div/child::div[@class=\"puisg-row puis-desktop-list-row\"]/child::div/child::div/child::div/child::div/child::div/child::a/child::span/child::span[ @aria-hidden=\"true\"]/child::span[@ class=\"a-price-whole\"]"));
		
		System.out.println(price.getText());
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();

	}

}
