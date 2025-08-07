package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {
	
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//identify prompt pop up
		WebElement prompt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		prompt.click();
		
		Thread.sleep(3000);
		
		//handle prompt popup
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("virat");
		alert.accept();
		
		//capture the result
		WebElement res = driver.findElement(By.id("result"));
		System.out.println(res.getText());
		
		Thread.sleep(3000);
		
		//close the driver
		driver.quit();
	}

}
