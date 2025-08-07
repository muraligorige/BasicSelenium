package AutoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_HandlingDynamicDemoWebShopApplication {
	
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an apply
		driver.get("https://demowebshop.tricentis.com/");
		
		//identify Search TF
		driver.findElement(By.id("small-searchterms")).sendKeys("com");
		
		List<WebElement> list=driver.findElements(By.xpath("//a[contains(text(),'comp')]"));
		
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
		}
		
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
	}

}
