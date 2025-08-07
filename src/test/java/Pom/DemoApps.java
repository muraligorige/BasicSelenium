package Pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PomUtility.DemoApp;

public class DemoApps {

	public static void main(String[] args) throws IOException {
		
		//convert physical file to java obj
		FileInputStream fileInputStream=new FileInputStream("./src/test/resources/DemoApps.properties");
		Properties properties=new Properties();
		properties.load(fileInputStream);
			
		WebDriver driver=new ChromeDriver();			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url=properties.getProperty("url");
		driver.get(url);
						
		//using pomdata
		DemoApp demoApps=new DemoApp(driver);
		
		//fetch the data from properties file
		 String untf = properties.getProperty("user");
		 demoApps.getUnTf().sendKeys(untf);
		 String email = properties.getProperty("email");
		 demoApps.getEmailtf().sendKeys(email);
		 String pwd = properties.getProperty("password");
		 demoApps.getPwdtf().sendKeys(pwd);
		 demoApps.getRegisterbtn().click();
		 
		 //close the driver
		 driver.quit();
	
	}

}
