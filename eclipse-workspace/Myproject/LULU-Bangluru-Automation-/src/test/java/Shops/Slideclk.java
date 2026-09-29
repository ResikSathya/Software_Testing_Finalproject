package Shops;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Slideclk {
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	@BeforeMethod(description="Verify that the user can click on all locations after hovering the location link")
	public void navigator() throws InterruptedException 
	{
		driver.get("https://www.bengaluru.lulumall.in/shop-2/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test(description="Verify that the user csn click on the slide")
	public void click() throws InterruptedException
	{
		WebElement slide=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@class='swiper-slide-image'])[5]")));
		slide.click();
        Thread.sleep(2000);
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
	

}
