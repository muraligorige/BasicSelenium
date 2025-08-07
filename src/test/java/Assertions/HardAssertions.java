package Assertions;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	
	@Test
	public void hardAssert() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
	
		//fetch the title
		String actualTitle = driver.getTitle();
		
		String expTitle="Facebook – log in or sign up";
		
		//validate title using hard assert
//		Assert.assertEquals(actualTitle, expTitle);//true
//		Assert.assertNotEquals(actualTitle,expTitle);//false
		
		
		Assert.assertFalse(actualTitle.contains(expTitle));//false
//		Assert.assertTrue(actualTitle.contains(expTitle));//true
		
//		Assert.assertNotNull(expTitle);//true
//		Assert.assertNull(expTitle);//false
		
		
		System.out.println("verified title");
		Assert.fail();
		
		driver.quit();
	}

}
