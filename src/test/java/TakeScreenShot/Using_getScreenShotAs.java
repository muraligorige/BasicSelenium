package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_getScreenShotAs {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicty wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);

		//take a screenshot of webpage
		//step1: Downcast take screenshot with driver reference variable	
		TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
		
		//step2: Take ss and store it an in a temp folder
		File src=takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		//step3:create a new file
		File dest=new File("./SCREENSHOT/filpkart.png");
		
		//step4:copy the ss from src to dest
		FileUtils.copyFile(src, dest);
		
		//close the driver
		driver.quit();
		
	}
	
}