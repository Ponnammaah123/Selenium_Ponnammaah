package day5;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGridDemo {
	WebDriver driver;
 
	@Parameters({"browserName","browserVersion","os","osVersion"})
	@BeforeMethod
	public void setup(String browserName,String browserVersion, String os,String osVersion) {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName",browserName);
		capabilities.setCapability("browserVersion",browserVersion);
		capabilities.setCapability("os",os);
		capabilities.setCapability("osVersion",osVersion);
		URL url = null;
		try {
			url= new URL("https://ponnammaah_bgPcjo:8KqCkP3gk2yUqXsrkD9v@hub-cloud.browserstack.com/wd/hub");

		}catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver = new RemoteWebDriver(url,capabilities);

	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void login() throws InterruptedException {
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");



		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");



		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();



		Thread.sleep(1000);
		driver.findElement(By.xpath("//a//b[text()='Admin']")).click();
		Thread.sleep(1000);



		driver.findElement(By.xpath("//input[@name='btnAdd']")).click();
		Thread.sleep(1000);



		driver.findElement(By.xpath("//input[@name='systemUser[employeeName][empName]']")).sendKeys("Mukesh Otwani");
		driver.findElement(By.xpath("//input[@name='systemUser[userName]']")).sendKeys("Ponnamma");
		driver.findElement(By.xpath("//input[@name='systemUser[password]']")).sendKeys("Ponnamma@1012");
		driver.findElement(By.xpath("//input[@name='systemUser[confirmPassword]']")).sendKeys("ponnamma@1012");



		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='btnSave']")).click();



		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='welcome']")).click();



		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();



		Thread.sleep(1000);
		Assert.assertTrue(driver.getCurrentUrl().contains("index.php"));
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Ponnamma");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Ponnamma@1012");



		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();



	}
}



