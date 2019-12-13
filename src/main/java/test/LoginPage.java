package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(name="login")
	private WebElement txtUserName;
	
	@FindBy(name="password")
	private WebElement txtPassword;
	
	@FindBy(name="click")
	private WebElement btnSubmit;
	
	@FindBy(name="test")
	private WebElement successMessage;
	
	@FindBy(name="hello")
	private WebElement errorMessage;
	
	public void login(String user, String password) {
		txtUserName.clear();
		txtUserName.sendKeys(user);
		txtPassword.clear();
		txtPassword.sendKeys(password);
		btnSubmit.click();
	}
	
	public boolean isLoginSuccess() {
		try {
			return successMessage.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public void verifyLoginMessage(String message) {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOf(successMessage));
//		
//		String actual = 
	}
	
}
