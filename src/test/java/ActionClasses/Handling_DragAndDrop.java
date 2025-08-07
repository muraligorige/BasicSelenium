package ActionClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Handling_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		
		//launch the browser
		 WebDriver driver = new ChromeDriver();
		 
		 //maximize the window
		 driver.manage().window().maximize();
		 
		 //implict wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 //navigate to an application
		 driver.get("https://demo.guru99.com/test/drag_drop.html");
		 
		 //drag and drop elements
		 WebElement drag1=driver.findElement(By.id("fourth"));
		  WebElement drop1= driver.findElement(By.id("amt7"));
		  
			 WebElement drag3=driver.findElement(By.id("fourth"));
			  WebElement drop3= driver.findElement(By.id("amt8"));
		  
		  WebElement drag2=driver.findElement(By.id("credit2"));
		  WebElement drop2=driver.findElement(By.id("bank"));
		  
		  WebElement drag4=driver.findElement(By.id("credit1"));
		  WebElement drop4=driver.findElement(By.id("loan"));
		  
		  Actions actions=new Actions(driver);
		  actions.dragAndDrop(drag1, drop1).perform();
		  actions.dragAndDrop(drag2, drop2).perform();
		  actions.dragAndDrop(drag3, drop3).perform();
		  actions.dragAndDrop(drag4, drop4).perform();
		  
		  WebElement element=driver.findElement(By.id("equal"));
		  if(element.isDisplayed()) {
			  System.out.println(element.getText());
		  }else {
			  System.out.println("perfect Not Displayed");
		  }
		  
		  Thread.sleep(5000);
		  
		  //close the driver
		  driver.quit();
		 

	}

}
