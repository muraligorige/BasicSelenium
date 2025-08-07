package TestNG;

import org.testng.annotations.Test;

public class Using_PriorityFlag{
	
	@Test(priority = 2)
	public void login() {
		System.out.println("Login successfully");
	}
	
	@Test(priority = 3)
	public void create() {
		System.out.println("Account created successfully");
	}
	
	@Test(priority = 1)
	public void register() {
		System.out.println("registered successfully");
	}

}
