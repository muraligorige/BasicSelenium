package DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Using_MultipeSetOfDataProviders {
	
	@Test(dataProvider = "data")
	public void loginTestScript(String username , String password) {
		System.out.println(username + password);
	}

	@DataProvider
	public Object[][] data() {
		
		Object[][] obj=new Object[3][2];
		obj[0][0]="user1";
		obj[0][1]="pswd1";
		
		obj[1][0]="user2";
		obj[1][1]="pswd2";
		
		obj[2][0]="user3";
		obj[2][1]="pswd3";
		
		return obj;
		
	}
}
