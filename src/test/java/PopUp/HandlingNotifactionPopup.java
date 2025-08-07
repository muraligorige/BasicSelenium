package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingNotifactionPopup {

	public static void main(String[] args) throws InterruptedException {
		
		//Disabling notification popup
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("---disabled notification---");
		chromeOptions.addArguments("---disablegeloaction---");
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		
		//identify notification btn and click on it
		driver.findElement(By.id("browNotButton")).click();
		
		Thread.sleep(3000);
		
		//close the driver
		driver.quit();
	}

}
