package Events;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Navigationbar {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	@BeforeMethod
	public void navigator() throws InterruptedException
	{
		driver.get("https://www.bengaluru.lulumall.in/events-2/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// Handle JavaScript alert if it appears
		
	}
	@Test(description="Verify that the user can click on all links in the navbar")
	public void nav() throws InterruptedException
	{
		Thread.sleep(3000);
//		WebElement Home =(driver.findElement(By.xpath("//a[text()='Home']")));
		WebElement Home = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Home']")));
		Home.click();
		Thread.sleep(2000);
		driver.navigate().back();
		//WebElement Shop =driver.findElement(By.xpath("//a[text()='Shop']"));
		WebElement Shop = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Shop']")));

		Shop.click();
		Thread.sleep(2000);
		WebElement Dine = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Dine']")));
		Dine.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement Entertainment = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Entertainment']")));
		Entertainment.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement Offers = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Offers']")));
		Offers.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement Events = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Events']")));
		Events.click();	
		
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}

}
