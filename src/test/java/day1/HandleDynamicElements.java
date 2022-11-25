//package day1;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class HandleDynamicElements {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
//		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
//		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
//		
//		//implicitly wait(250ms)
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Sapient");
//		driver.findElement(By.xpath("//input[@value='Show me']")).click();
//		
//		// explicit wait
//		WebDriverWait wait= new WebDriverWait.Duration.ofSeconds(20);
//		WebElement element = wait.until(ExpectedCondition.elementToBeClickable(By.xpath("//input[@id='passnew']")));
//		element.sendKeys("ponnamma");
//		driver.quit();
//
//	}
//
//}
