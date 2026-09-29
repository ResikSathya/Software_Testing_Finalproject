package Events;

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

public class EventImg {
	WebDriver driver = new ChromeDriver();
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
	}
	@Test(description="Verify the user can click on the event image")
   public void enent() throws InterruptedException
   {
		WebElement wonder=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='etn-event-thumb'])[11]")));
		wonder.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement runway=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='etn-event-thumb'])[12]")));
		runway.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement flower=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='etn-event-thumb'])[13]")));
		flower.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement scrol=driver.findElement(By.xpath("//h3[normalize-space()='Find Us']"));
		Actions act=new Actions(driver);
		act.moveToElement(scrol).build().perform();
		WebElement republic=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='etn-event-thumb'])[14]")));
		republic.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement spr=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='etn-event-thumb'])[15]")));
		spr.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement lulu=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='etn-event-thumb'])[16]")));
		lulu.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
   }
	@AfterTest
	public void close()
	{
		driver.close();
	}
}
