package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUser {
	@FindBy(name="login")
	private WebElement userName;
	@FindBy(name="password")
	private WebElement password;
	@FindBy(name="click")
	private WebElement submit;
		
	public void addUser(String user, String pass) {
		userName.sendKeys(user);
		password.sendKeys(pass);
		submit.click();
	}
}
