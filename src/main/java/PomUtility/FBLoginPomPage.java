package PomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPomPage {
	
	//Declare
	@FindBy(xpath = "//h2")
	private WebElement header;
	
	@FindBy(id = "email")
	private WebElement unTF;
	
	@FindBy(id = "pass")
	private WebElement pswdTF;
	
	@FindBy(name = "login")
	private WebElement loginBTN;
	
	//Initilize
	
	public FBLoginPomPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Utilize
	
	public WebElement getHeader() {
		return header;
	}

	public void getUnTF(String user) {
		unTF.sendKeys(user);
	}

	public WebElement getPswdTF() {
		return pswdTF;
	}

	public void getLoginBTN() {
		 loginBTN.click();;
	}
	
	//bussiness logic
	public void login(String user , String password) {
		unTF.sendKeys(user);
		pswdTF.sendKeys(password);
		loginBTN.click();
	}

}
