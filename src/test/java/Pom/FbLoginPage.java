package Pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PomUtility.FBLoginPomPage;

public class FbLoginPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		// How To Avoiding SERE 
//		WebElement un = driver.findElement(By.id("email"));
//		un.sendKeys("murali");
//		driver.navigate().refresh();
//		driver.findElement(By.id("email")).sendKeys("murali Kuruma");
		
		//  Here also How To Avoiding SERE and entering the data by using POM
		FBLoginPomPage fbLoginPomPage=new FBLoginPomPage(driver);
//		fbLoginPomPage.getUnTF("murali");
//		driver.navigate().refresh();
//		fbLoginPomPage.getUnTF("muraliKuruma");
//		fbLoginPomPage.getPswdTF().sendKeys("murali@123");
//		fbLoginPomPage.getLoginBTN();
		
		fbLoginPomPage.login("murali", "murali@123");
	
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
		

	}

}
