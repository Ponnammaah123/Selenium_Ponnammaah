package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {


public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.findElement(By.name("q"));
	Thread.sleep(2000);
	driver.findElement(By.id("//input[@id='nav-search-submit-button']")).click();
	driver.findElement(By.id("//input[title = 'Search For']")).sendKeys("ponnamma");
	Thread.sleep(2000);
	String s = driver.getCurrentUrl();
	String  title = driver.getTitle();
	System.out.println(s);
	System.out.println(title);
	driver.quit();
}
	
}