package WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_gettorsMethods {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver= new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to an apply
		driver.get("https://demowebshop.tricentis.com/");
		
		 //identify an ele
		 WebElement ele = driver.findElement(By.xpath("//a[@ class=\"ico-register\"]"));
//		 ele.click();
	     System.out.println("Visible Text: "+ele.getText());
		 System.out.println("Attribute value: "+ele.getAttribute("class"));
		 System.out.println("Tagname: "+ele.getTagName());
		 System.out.println("width & height: "+ele.getSize());
		 System.out.println("X-axis & y-axis: "+ele.getLocation());
		 System.out.println("x-axis: "+ele.getRect().getX());
		 System.out.println("y-axis: "+ele.getRect().getY()); 
		 System.out.println("height: "+ele.getRect().getHeight());
		 System.out.println("width: "+ele.getRect().getWidth());
		 System.out.println("css value: "+ele.getCssValue("color"));
		
		Thread.sleep(3000);
		 
		 //close the window
		 driver.quit();
	

	}

}
