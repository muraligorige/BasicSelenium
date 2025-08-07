package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesCalendarPopup {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		driver.get("https://www.makemytrip.com/");
		
		//click on cross icons
		driver.findElement(By.className("commonModal__close")).click();
		driver.findElement(By.xpath("//span[contains(@class,'styles')]")).click();
		
		//identify From TF
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("(//p[@class=\"font14 appendBottom5 blackText\"])[2]")).click();

		Thread.sleep(3000);
		
		//identify TO TF
		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.id("react-autowhatever-1-section-0-item-2")).click();

		Thread.sleep(3000);
		
		//identify calendar
		driver.findElement(By.xpath("//div[@aria-label='Thu Aug 07 2025']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class=\"lbl_input appendBottom10\"])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@aria-label='Wed Aug 27 2025']")).click();
		Thread.sleep(3000);

		driver.quit();

	}
}