package Entertainment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Slideclick {
	WebDriver driver= new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	@BeforeMethod
	public void navigator() throws InterruptedException
	{
		driver.get("https://www.bengaluru.lulumall.in/entertainment/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test
	public void slide()
	{
		WebElement slide=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\'swiper-slide swiper-slide-prev\']")));
		slide.click();
		driver.close();
				
	}

}
