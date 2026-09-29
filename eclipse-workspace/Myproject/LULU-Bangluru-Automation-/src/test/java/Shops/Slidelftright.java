package Shops;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Slidelftright {
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	@BeforeMethod
	public void navigator() throws InterruptedException
	{
		driver.get("https://www.bengaluru.lulumall.in/shop-2/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
	}
	@Test
	public void controlslide() throws InterruptedException
	
	{
		WebElement left=driver.findElement(By.xpath("//i[@class='eicon-chevron-left']"));
		left.click();
		System.out.println("Left clicked");
		Thread.sleep(2000);
		WebElement right=driver.findElement(By.xpath("//i[@class='eicon-chevron-right']"));
		right.click();
		System.out.println("Right clicked");
		Thread.sleep(2000);
		driver.close();
	}

}
