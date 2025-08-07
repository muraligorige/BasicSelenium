package ExceptionTask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementException {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-exceptions/");
		driver.findElement(By.id("add_btn")).click();
		Thread.sleep(3000);
		WebElement row2 = driver.findElement(By.id("row2"));
		if (row2.isDisplayed()) {
			System.out.println("Row 2 input field is displayed");
		} else {
			System.out.println("Row 2 input field is NOT displayed");
		}
		
		driver.findElement(By.id("errorMessage")).click(); 


		Thread.sleep(3000);
		driver.quit();

	}

}
