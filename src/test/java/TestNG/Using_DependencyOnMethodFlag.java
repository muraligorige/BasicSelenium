package TestNG;

import org.testng.annotations.Test;

public class Using_DependencyOnMethodFlag {
	
	@Test
	public void java() {
		System.out.println("java");
	}
	
	@Test(dependsOnMethods = "java")
	public void automation() {
		System.out.println("selenium");
	}

}
