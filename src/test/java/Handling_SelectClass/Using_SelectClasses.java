package Handling_SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Using_SelectClasses {

	public static void main(String[] args) throws InterruptedException {

		
		//launch the browser
		WebDriver driver= new EdgeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to application
		driver.get("https://www.amazon.in/");
		
		//identify UN TF
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		
		Select select = new Select(dropdown);
		
		//select the option through index
		select.selectByIndex(2);
		
		Thread.sleep(4000);
		
		//select the option through attribute
		select.selectByValue("search-alias=collectibles");
		
		//select option by visible text
		select.selectByVisibleText("Collectibles");
		Thread.sleep(4000);
		
		//fetch all the options
		List<WebElement> list=select.getOptions();
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
		}
		
		//check the DD whether it is single selector or multi select DD
		if (select.isMultiple()) {
			System.out.println("Multi select DD");
		}else {
			System.out.println("single select DD");
		}
		
		//fetch the first selected option
		String s=select.getFirstSelectedOption().getText();
		System.out.println("first selected option"+s);
		
		//fetch all the selected options
		List<WebElement> li=select.getAllSelectedOptions();
		for (WebElement webEle : li) {
			System.out.println("selected opotions"+webEle.getText());
			
		}
		
		driver.quit();
	}

}
