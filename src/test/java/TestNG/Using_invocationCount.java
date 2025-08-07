package TestNG;

import org.testng.annotations.Test;

public class Using_invocationCount {
	
	@Test(priority = 2)
	public void login() {
		System.out.println("Login successfully");
	}
	
	@Test(priority = 3,invocationCount = 3)
	public void create() {
		System.out.println("Account created successfully");
	}
	
	@Test(priority = 1)
	public void register() {
		System.out.println("registered successfully");
	}

}