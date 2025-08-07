package TestNG;

import org.testng.annotations.Test;

public class Using_ThreadPollSize {
	
	@Test
	public void shinchan() {
		System.out.println("shinchan");
	}
	
	@Test(threadPoolSize = 3,invocationCount = 4)
	public  void doremon() {
		System.out.println("doremon");
	}

}
