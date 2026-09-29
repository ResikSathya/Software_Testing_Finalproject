package Dine;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Location {
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	@BeforeMethod
	public void navigator() throws InterruptedException
	{
		driver.get("https://www.bengaluru.lulumall.in/dine/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test( priority=1,description="Verify that the user can click on the location link")
	public void locate()
	{
		WebElement loc=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"hfe-menu-item\" and @href=\"http://13.126.115.44/\"]")));
		loc.click();
	}
	@Test(priority=2,description="Verify thet the user can hover on the location link")
	public void hover() throws InterruptedException
	{
		WebElement loc=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"hfe-menu-item\" and @href=\"http://13.126.115.44/\"]")));
        Thread.sleep(2000);
		Actions action =new Actions(driver);
         action.moveToElement(loc).perform();
         Thread.sleep(1000);
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
