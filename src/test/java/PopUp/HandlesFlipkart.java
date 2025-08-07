package PopUp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlesFlipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Mobiles"+Keys.ENTER);
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("(//div[@class=\"_4WELSP\"])[1]")).click();
		Set<String> childWindows = driver.getWindowHandles();
		ArrayList<HandlesFlipkart> arrayList=new ArrayList<HandlesFlipkart>();
		int child1=arrayList.lastIndexOf(1);
		for (String string : childWindows) {
			if(!driver.getTitle().contains(string)) {
				System.out.println(driver.getTitle());
				WebElement addToCart = driver.findElement(By.xpath("//button[@class=\"QqFHMw vslbG+ In9uk2\"]"));
				Actions  actions=new Actions(driver);
				actions.click(addToCart).perform();
			}
		}
		driver.switchTo().window(parentWindow);
		Thread.sleep(3000);
		driver.quit();

	}

}
