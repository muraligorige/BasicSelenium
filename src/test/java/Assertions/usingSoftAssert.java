package Assertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class usingSoftAssert {
	
	@Test
	public void softAssert() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		
		//fetch the title
		String actualTitle=driver.getTitle();
		
		String expTitle="Facebook – log in or sign up";
		
		//validate title using soft copy
		SoftAssert softAssert=new SoftAssert();
//		softAssert.assertEquals(actualTitle, expTitle);//true
//		softAssert.assertNotEquals(actualTitle, expTitle);//false
		
//		softAssert.assertFalse(actualTitle.contains(expTitle));//false
//		softAssert.assertTrue(actualTitle.contains(expTitle));//true
		
//		softAssert.assertNotNull(expTitle);//true
		softAssert.assertNull(expTitle);//false
		
		System.out.println("verified title");
		driver.quit();
		softAssert.assertAll();
		
	}

}
