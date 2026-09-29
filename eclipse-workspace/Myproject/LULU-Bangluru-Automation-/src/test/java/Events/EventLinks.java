package Events;

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

public class EventLinks {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
	@BeforeMethod
	public void Navigator() throws InterruptedException
	{

		driver.get("https://www.bengaluru.lulumall.in/events-2/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test(priority=1,description="Verify that the user can click on Expired Events link")
	public void test() throws InterruptedException
	{
		WebElement event=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='etn-tab-a ']")));
	    event.click();
	    Thread.sleep(2000);
	    WebElement upcome=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='etn-tab-a etn-active']")));
	    upcome.click();
	}
	
	@AfterTest
	public void close()
	{
		driver.quit();
	}
	

}



