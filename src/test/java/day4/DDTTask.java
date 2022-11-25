package day4;



import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DDTTask {
     WebDriver driver;
        @BeforeMethod
        public void setup() {
            System.out.println("Running before method");
            driver = new ChromeDriver();
            //driver.get("");
            driver.get("https://ineuron-courses.vercel.app/login");
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
            driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            
        }
        @AfterMethod
        public void tearDown() {
            driver.quit();
            System.out.println("Running after method");
            
        }
        @Test(dataProvider="testdata")
        public void login(String username,String password) {
            //WebDriver driver = new ChromeDriver();
            //driver.manage().window().maximize();
            //driver.get("https://ineuron-courses.vercel.app/login");
//            Assert.assertTrue(driver.getCurrentUrl().contains("ineuron"));
            driver.findElement(By.name("email1")).sendKeys(username);
            driver.findElement(By.id("password1")).sendKeys(password);
            driver.findElement(By.className("submit-btn")).click();
//            WebElement driver=driver.findElement(null)
            Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Sign out']")).isDisplayed());
        }
    



       @DataProvider(name="testdata")
        public Object[][] testDataGeneration()
        {
            Object [][]arr=new Object[4][2];
            
            arr[0][0]="sample9@gmail.com";
            arr[0][1]="Mukesh1234";
            arr[1][0]="samplemukesh@gmail.com";
            arr[1][1]="Mukesh1234";
            arr[2][0]="samplemukesh1@gmail.com    ";
            arr[2][1]="Mukesh1234";
            arr[3][0]="samplemukesh2@gmail.com    ";
            arr[3][1]="Mukesh1234";
            
            return arr;
        }
}