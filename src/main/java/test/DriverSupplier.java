package test;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSupplier {
	
	private static final String CHROME_DRIVER_PATH = System.getProperty("user.dir") + File.separator + "lib" + File.separator +"chromedriver";
	
	public WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
		return new ChromeDriver();
	}
}
