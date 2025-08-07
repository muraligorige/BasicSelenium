package ExceptionTask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementNotInteractableException {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-exceptions/");
		driver.findElement(By.id("add_btn")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("row2")));
		WebElement row2 = driver.findElement(By.id("row2"));
		row2.sendKeys("Murali");
		driver.findElement(By.name("Save")).click();
		String value = driver.findElement(By.id("row2")).getAttribute("value");
		if ("Murali".equals(value)) {
			System.out.println("Text saved successfully");
		} else {
			System.out.println("Text not saved as expected");
		}

		Thread.sleep(3000);
		driver.quit();

	}

}
