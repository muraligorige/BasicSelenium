package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppsTask {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		
		WebElement element=driver.findElement(By.xpath("//iframe[@class=\"w-full h-96\"]"));
		
		driver.switchTo().frame(element);
		
		Thread.sleep(3000);
		
		//switch to nested iframe
		driver.switchTo().frame(0);
		
		//identify Email TF
		driver.findElement(By.id("email")).sendKeys("Murali123@gmail.com");
		
		//identify PSWD TF
		driver.findElement(By.id("password")).sendKeys("MUrali123");
		
		//identify PSWD TF
		driver.findElement(By.id("confirm-password")).sendKeys("Murali123");
		
		//click on Sign in btn
		driver.findElement(By.id("submitButton")).click();

		Thread.sleep(3000);
			
		//close the driver
		driver.quit();

	}

}
