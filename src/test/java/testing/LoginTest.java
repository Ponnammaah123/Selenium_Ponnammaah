package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver = new ChromeDriver();

	@BeforeMethod
	public void setup() {
		driver.get("http://www.google.com");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		// System.out.println("Running after method");

	}

	@Test
	public void verifyNoEntry() throws InterruptedException {

		Thread.sleep(3000);

	}

}
