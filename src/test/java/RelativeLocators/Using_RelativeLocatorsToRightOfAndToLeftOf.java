package RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Using_RelativeLocatorsToRightOfAndToLeftOf {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver= new EdgeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to an apply
		driver.get("https://www.amazon.in");
		
		//identify an ELE
		 WebElement ele = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		 
		 //identify leftSide ele
	 driver.findElement(RelativeLocator.with(By.tagName("span")).toLeftOf(ele)).click();
	 driver.navigate().back();
	 
	//identify an ELE
	 WebElement ele1 = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

	 //identify rightSide ele
	 	driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(ele1)).click();
	 	driver.navigate().back();
	 	
		 Thread.sleep(3000);
		 
		 //close the window
		 driver.quit();
		 
		 //here we have to right two times by identying ana ele why because rightside ele store that one and we are perform same ele we get EXCEPTION thats why we have to right two times
	}

}
