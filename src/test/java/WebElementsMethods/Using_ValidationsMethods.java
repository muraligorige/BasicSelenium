package WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_ValidationsMethods{

    public static void main(String[] args) throws InterruptedException {
        
        // Launch the browser
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Navigate to the demo webshop
        driver.get("https://demowebshop.tricentis.com/");
        
        //identify register element
        WebElement ele= driver.findElement(By.className("ico-register"));
        
        // Validate if the element is displayed and enabled before clicking
        if (ele.isDisplayed() && ele.isEnabled()) {
            ele.click();
            System.out.println("Register link clicked");
        } else {
            System.out.println("Register link not found or not clickable");
        }
        
        driver.navigate().back();
        
        //identify Search TF
         WebElement ele1 = driver.findElement(By.xpath("//input[@ class=\"search-box-text ui-autocomplete-input\"]"));
         if (ele1.isSelected()) {
			ele1.sendKeys("Laptops");
		}else {
			System.out.println("Search textField not found");
		}
        
        Thread.sleep(3000);

        // Close the browser
        driver.quit();
    }
}