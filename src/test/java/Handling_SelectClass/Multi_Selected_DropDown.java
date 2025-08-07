package Handling_SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Selected_DropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver= new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to application
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(3000);
		
		WebElement multiDD=driver.findElement(By.id("cars"));
		
		//select muliple options
		Select select=new Select(multiDD);
		
		//check the DD whether it is single select or multi select DD
		System.out.println("Multi selected DD"+select.isMultiple());
		
		//select multiple elements
		select.selectByIndex(3);
		select.selectByValue("volvo");
		select.selectByVisibleText("Opel");
		
		//fetch all the options
	List<WebElement> list	=select.getOptions();
	for (WebElement webElement : list) {
		System.out.println(webElement.getText());
	}
	
	//fetch the selected option
	String s=select.getFirstSelectedOption().getText();
		System.out.println("First selected Option"+s);
		
		//fetch all the selected options
		List<WebElement> li=select.getAllSelectedOptions();
		for (WebElement webEle: li) {
			System.out.println("selected options"+webEle.getText());
		}
		
		
		//deselect the options
		select.deselectByIndex(3);
		Thread.sleep(3000);
		
		select.deselectByValue("volvo");
		Thread.sleep(4000);
		
		select.deselectByVisibleText("Opel");
		Thread.sleep(3000);
		
		//close the driver
		driver.quit();
		
	}

}
