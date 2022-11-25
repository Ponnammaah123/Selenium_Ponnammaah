package day1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ineuron-courses.vercel.app/login");
		WebElement username = driver.findElement(By.name("email1"));
		username.sendKeys("ineuron@ineuron.ai");
		driver.findElement(By.id("password1")).sendKeys("ineuron");
		driver.findElement(By.className("submit-btn")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Manage']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act = new Actions(driver);
		act.moveToElement((WebElement) By.xpath("//span[normalize-space()='Manage Categories']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String parent=driver.getWindowHandle();
		System.out.println("parent window handle is "+parent);
		

		Set<String> allWindowHandle=driver.getWindowHandles();

		System.out.println("Total Set values "+allWindowHandle);

		int count=allWindowHandle.size();

		System.out.println("Total count is "+count);


		for(String child:allWindowHandle)
		{

			if(!child.equals(parent))
			{

				driver.switchTo().window(child);
				String newTitle=driver.getTitle();
				System.out.println("New title is "+newTitle);
				driver.quit();
			}


		}

		driver.findElement(By.xpath("//button[normalize-space()='Add New Category']")).click();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("newuser");
		driver.switchTo().alert().accept();
		
		









	}

}
