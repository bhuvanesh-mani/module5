package test;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverSupplier {
	
	private static final String CHROME_DRIVER_PATH = System.getProperty("user.dir") + File.separator + "lib" + File.separator +"chromedriver";
	
	public WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		return new ChromeDriver(options);
	}
}
