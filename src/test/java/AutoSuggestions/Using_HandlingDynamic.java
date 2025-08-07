package AutoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_HandlingDynamic {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an apply
		driver.get("https://www.google.com/");
		
		//identify search TF
		driver.findElement(By.id("APjFqb")).sendKeys("virat");		
		Thread.sleep(3000);
		
		//click on multi suggestions
		driver.findElement(By.id("jZ2SBf")).click();
		
		//navigate to back
		driver.navigate().back();
		
		driver.findElement(By.id("APjFqb")).sendKeys("virat");	
		
		//identify  All auto suggestions 
		List<WebElement> element=driver.findElements(By.xpath("//span[text()='virat']"));
		for (WebElement webElement :element) {
			System.out.println("Fetching All auto Suggestions:"+webElement.getText());
			
		}
		
		Thread.sleep(3000);
		
		//close the driver
		driver.quit();
		

	}

}
