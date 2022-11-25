package day5;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class FileDownloaderCount {
	WebDriver driver;


	@BeforeMethod
	public void setup() {
		
		
	
		System.out.println("Running before method");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();//
		System.out.println("Running after method");
	}
	
	
}
	