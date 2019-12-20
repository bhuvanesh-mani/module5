package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {

	@Test
	public void testcase1() {
		WebDriver driver = null;
		boolean actual = false;
		try {
			driver = new DriverSupplier().getChromeDriver();
			
			driver.get("http://localhost:3001/add.php");
			AddUser addUsr = PageFactory.initElements(driver, AddUser.class);
			addUsr.addUser("bhuvanesh", "12345");
			
			driver.get("http://localhost:3001");
			LoginPage page = PageFactory.initElements(driver, LoginPage.class);
			page.login("bhuvanesh", "12345");
			actual = page.isLoginSuccess();
			Assert.assertEquals(actual, true);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		} finally {
			if (driver != null)
				driver.quit();
		}
	}

	@Test
	public void testcase2() {
		WebDriver driver = null;
		boolean actual = false;
		try {
			driver = new DriverSupplier().getChromeDriver();
			driver.get("http://localhost:3001");
			LoginPage page = PageFactory.initElements(driver, LoginPage.class);
			page.login("bhuvanesh1", "12345");
			actual = page.isLoginSuccess();
			Assert.assertEquals(actual, false);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		} finally {
			if (driver != null)
				driver.quit();
		}

		
	}

}
