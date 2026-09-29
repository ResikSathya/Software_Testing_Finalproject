package Offer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class slideleftright {
	WebDriver driver= new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	@BeforeMethod
	public void navigator() throws InterruptedException
	{
		driver.get("https://www.bengaluru.lulumall.in/offers/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test
	public void slide() throws InterruptedException
	{
		WebElement left=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class=\"eicon-chevron-left\"]")));
		left.click();
		Thread.sleep(2000);
		System.out.println("Left clicked");
		WebElement right=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class=\"eicon-chevron-right\"]")));
		right.click();
		System.out.println("right clicked");

	}
		

}
