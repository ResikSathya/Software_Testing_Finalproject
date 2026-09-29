package Dine;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SlideClk {
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	@BeforeMethod(description="Verify that the user can click on the slide img")
	public void navigator() throws InterruptedException 
	{
		driver.get("https://www.bengaluru.lulumall.in/dine/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test
	public void slide() throws InterruptedException
	{
		WebElement sld =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='swiper-slide-image']")));
		sld.click();
		Thread.sleep(2000);
		driver.close();
	}
}
