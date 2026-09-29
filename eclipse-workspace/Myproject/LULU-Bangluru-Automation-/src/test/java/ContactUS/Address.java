package ContactUS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Address {
	WebDriver driver= new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	@BeforeMethod
	public void navigator() throws InterruptedException
	{
		driver.get("https://www.bengaluru.lulumall.in/contact-us/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test(description="Verify that the user can direct get map after clicking map icon and address content")
	public void contact() throws InterruptedException
	{
		WebElement icon=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class=\"fas fa-location-arrow\"]")));
		icon.click();
		Thread.sleep(2000);
		WebElement address=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class=\"elementor-icon-list-text\"])[1]")));
		address.click();
		driver.close();
	}
}
