package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFileUploadUsingRobot {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		StringSelection selection=new StringSelection("C:\\\\Users\\\\user\\\\OneDrive\\\\Pictures\\\\Saved Pictures");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement upload = driver.findElement(By.id("file-upload"));
		
		Actions actions=new Actions(driver);
		actions.click(upload).perform();
		
		Thread.sleep(3000);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
