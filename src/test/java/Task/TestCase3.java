package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		//identify UN TF
		driver.findElement(By.id("username")).sendKeys("student");
		
		//identify Pswd TF
		driver.findElement(By.id("password")).sendKeys("murali123");
		
		//click on button
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(3000);
		
		//verified invalid username
		WebElement element=driver.findElement(By.id("error"));
		if (element.getText()!=null) {
			System.out.println("Error message is displayed");
		}else {
			System.out.println(" Error message isNot displayed");
		}
		
		//verified Your password is invalid!
		String actualtext=element.getText();
		String pswd="Your password is invalid!";
		if (actualtext.equals(pswd)) {
			System.out.println(pswd+" text is displayed");	
		}else {
			System.out.println("text is Not displayed");
		}
		
		Thread.sleep(3000);
		
		//close the driver
		driver.quit();

	}

}
