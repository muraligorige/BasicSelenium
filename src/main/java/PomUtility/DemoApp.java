package PomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoApp {
	
	//Declare
	@FindBy(xpath="//h1")
	private WebElement hedder;
	
	@FindBy(id="name")
	private WebElement unTf;
	
	@FindBy(id="email")
	private WebElement emailtf;
	
	@FindBy(id="password")
	private WebElement pwdtf;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement registerbtn;
	
	//Initilize
	public DemoApp(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}

	//Utilize
	public WebElement getHedder() {
		return hedder;
	}

	public WebElement getUnTf() {
		return unTf;
	}

	public WebElement getEmailtf() {
		return emailtf;
	}

	public WebElement getPwdtf() {
		return pwdtf;
	}

	public WebElement getRegisterbtn() {
		return registerbtn;
	}
	
	


}
