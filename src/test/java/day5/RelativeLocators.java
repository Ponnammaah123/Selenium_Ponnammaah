package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocators {
	WebDriver driver ;


public void Test() {

}
ChromeDriver driver = new ChromeDriver();
driver.get("");
WebElement username = driver.findElement(By.name(""));
username.sendKeys("S");