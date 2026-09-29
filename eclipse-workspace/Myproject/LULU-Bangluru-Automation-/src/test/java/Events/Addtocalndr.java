package Events;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Addtocalndr {
	WebDriver driver = new EdgeDriver();
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
	@BeforeMethod
	public void Navigator() throws InterruptedException
	{

		driver.get("https://www.bengaluru.lulumall.in/events-2/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement slide=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='etn-event-thumb'])[14]")));
		Actions acts=new Actions(driver);
		acts.moveToElement(slide).perform();
		WebElement wonder=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=\"etn-atend-btn\"])[11]")));
		wonder.click();
	}
	@Test(description="Verify that the user can click on all links under add to calender")
	public void google() throws InterruptedException
	{
		WebElement google=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='etn-add-to-calender'])[1]")));
		google.click();
		Thread.sleep(2000);

	}
	public void yahoo() throws InterruptedException
	{
		WebElement yahoo=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"etn-add-to-calender\"])[2]")));
		yahoo.click();
		Thread.sleep(2000);

	}
	public void apple() throws InterruptedException
	{
		WebElement apple=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"etn-add-to-calender\"])[3]")));
		apple.click();
		Thread.sleep(2000);

	}
	public void outlook() throws InterruptedException
	{
		WebElement outlook=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"etn-add-to-calender\"])[4]")));
		outlook.click();
		Thread.sleep(2000);

	}
	@AfterMethod
	public void close()
	{
		driver.quit();
	}

}
