package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Using_NavigateFacebook {
	
	@Parameters("browser")
	@Test(groups = "reg")
	public void facebookTest(String Browser) throws InterruptedException {
		WebDriver driver=null;
		if (Browser.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(Browser.equals("edge")) {
			driver=new EdgeDriver();
		}else {
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
//		System.out.println("facebook");
		Reporter.log("facebook " ,true);
		Thread.sleep(3000);
		driver.quit();
	}

}
