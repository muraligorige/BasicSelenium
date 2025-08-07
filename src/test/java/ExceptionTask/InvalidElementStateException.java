package ExceptionTask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidElementStateException {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-exceptions/");
		driver.findElement(By.id("edit_btn")).click();
		driver.findElement(By.id("row1")).clear();
		driver.findElement(By.id("row1")).sendKeys("Murali");
		driver.findElement(By.id("save_btn")).click();
		String value = driver.findElement(By.id("row1")).getAttribute("value");
		if ("Murali".equals(value)) {
			System.out.println("Text saved successfully");
		} else {
			System.out.println("Text not saved as expected");
		}
		Thread.sleep(3000);
		driver.quit();
		
	}

}
