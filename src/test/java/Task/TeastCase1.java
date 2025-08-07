package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TeastCase1 {

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
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		//click on button
		driver.findElement(By.id("submit")).click();
		
		//verify successful login by checking the URL
		String url="https://practicetestautomation.com/logged-in-successfully/";
		String actualurl=driver.getCurrentUrl();
		if (actualurl.equals(url)) {
			System.out.println("Login Successful verified");
		}else {
			System.out.println("Login unsuccessful Verified"+actualurl);
		}
		
		//congulrations or successfully login
		WebElement element=driver.findElement(By.tagName("h1"));
		if (element.getText() != null) {
			System.out.println("congulrations  successfully login");
		}else {
			System.out.println("login failed");
		}
		
		//verify logout button is displayed on new page
		WebElement element2=driver.findElement(By.xpath("//a[text()='Log out']"));
		if (element2.getText() !=null) {
			System.out.println("logout button is displayed");
		}else {
			System.out.println("logout button is not displayed");
		}
		
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();

	}

}
