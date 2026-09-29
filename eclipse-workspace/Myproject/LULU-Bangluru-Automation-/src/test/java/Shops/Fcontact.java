package Shops;

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

public class Fcontact {
	WebDriver driver= new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	@BeforeMethod
	public void navigator() throws InterruptedException
	{
		driver.get("https://www.bengaluru.lulumall.in/shop-2/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement our = driver.findElement(By.xpath("//a[normalize-space()='Terms and Condition']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.scrollToElement(our).perform();

	}
	@Test(description="Verify that the user can click on all links under con tact menu")
	public void contact()
	{
		WebElement first=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@class='elementor-icon-list-item'])[1]")));
		first.click();
		WebElement second=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@class='elementor-icon-list-item'])[2]")));
		second.click();
		WebElement third=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@class='elementor-icon-list-item'])[3]")));
		third.click();
	}
	@AfterTest()
	public void close()
	{
		driver.close();
	}
}
