package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {

		//launch the browser
		WebDriver driver=new EdgeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to url window
		driver.get("https://www.facebook.com/");

	}

}


