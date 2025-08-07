package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesFileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(3000);
		
		//Handling file upload popup
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\user\\OneDrive\\Pictures\\Saved Pictures");
		Thread.sleep(3000);
		
		driver.quit();

	}

}
