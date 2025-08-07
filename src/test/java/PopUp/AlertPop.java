package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop {

	public static void main(String[] args) throws InterruptedException {
	
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//identify of an element
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Thread.sleep(3000);
		
		//Handle to alert popup
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.dismiss();
		
		//capture the result
		WebElement res = driver.findElement(By.id("result"));
		System.out.println(res.getText());
		
		//close the driver
		driver.quit();
	}

}
