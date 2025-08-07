package TestNG;

import org.testng.annotations.Test;

public class Using_EnableClass {
	
	@Test
	public void cat() {
		System.out.println("cat");
	}
	
	@Test(enabled = false)
	public void  jerry() {
		System.out.println("jerry");
	}

}
