package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SmokeTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.out.println("Running Before Method - Creating Browser Session");
		driver = new ChromeDriver();
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
	}
	@AfterMethod
    public void tearDown() {
        driver.quit();
        System.out.println("Running after method");
        
    }
    
    @Test
    public void verifyURL() {
        Assert.assertTrue(driver.getCurrentUrl().contains("index.php"));
    }
    @Test
    public void verifyTitle() {
        Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
    }
    @Test
    public void verifySocialMediaCount() {
        Assert.assertEquals(driver.findElements(By.xpath("//div[@id='social-icons']//img")).size(),5);
    }
    @Test
    public void verifyForgotPasswordLink() {
        //Assert.assertEquals(driver.findElements(By.xpath()).size(),4);
    }
}








	




