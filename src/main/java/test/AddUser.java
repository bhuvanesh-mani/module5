package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddUser {
	@FindBy(name="login")
	private WebElement userName;
	@FindBy(name="password")
	private WebElement password;
	@FindBy(name="click")
	private WebElement submit;
	@FindBy(name="test")
	private WebElement confirmation;
	private WebDriverWait wait;
	
	
	public AddUser(WebDriver driver) {
		this.wait = new WebDriverWait(driver, 10);
	}
	
	public void addUser(String user, String pass) {
		userName.sendKeys(user);
		password.sendKeys(pass);
		submit.click();
		wait.until(ExpectedConditions.visibilityOf(confirmation));
	}
}
