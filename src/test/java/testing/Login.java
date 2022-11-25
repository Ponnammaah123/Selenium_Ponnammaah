package testing;



import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Login {
     WebDriver driver;
        @BeforeMethod
        public void setup() {
            System.out.println("Running before method");
            driver = new ChromeDriver();
            driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        @AfterMethod
        public void tearDown() {
            driver.quit();
            System.out.println("Running after method");
            
        }
        @Test
        public void noEntry() {
            driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
            Assert.assertTrue(driver.findElement(By.xpath("//span[@id='spanMessage']")).getText().contains("Username cannot be empty"));
        }
        @Test
        public void invalidUser() {
            driver.findElement(By.id("txtUsername")).sendKeys("@@@2");
            driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
            Assert.assertTrue(driver.findElement(By.xpath("//span[@id='spanMessage']")).getText().contains("Password cannot be empty"));
        }
        @Test
        public void invalidPassword() {
            driver.findElement(By.id("txtPassword")).sendKeys("1234");
            driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
            Assert.assertTrue(driver.findElement(By.xpath("//span[@id='spanMessage']")).getText().contains("Username cannot be empty"));
        }
        @Test
        public void validPassword() {
            driver.findElement(By.id("txtUsername")).sendKeys("Admin");
            driver.findElement(By.id("txtPassword")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
            driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
            Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
            driver.findElement(By.id("welcome")).click();
            driver.findElement(By.xpath("//a[text()='Logout']")).click();
     
            driver.findElement(By.xpath("//div[text()='LOGIN Panel']"));
        }
}
        
        
        