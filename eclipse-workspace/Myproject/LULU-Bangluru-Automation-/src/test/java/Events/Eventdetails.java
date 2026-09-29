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

public class Eventdetails {
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
		WebElement wonder=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=\"etn-atend-btn\"])[11]")));
		wonder.click();
		Thread.sleep(2000);
	}
	@Test(description="Verify the user can click on the event details")
   public void enent() throws InterruptedException
   {
		WebElement heading=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[@class=\"etn-event-entry-title\"]")));
		heading.click();
		Thread.sleep(2000);	
		
		WebElement img=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class=\"attachment-post-thumbnail size-post-thumbnail wp-post-image\"]")));
		heading.click();
		Thread.sleep(2000);	
		
		
		
		WebElement date=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=\" Date :\"]")));
		date.click();
		Thread.sleep(2000);	
		
		WebElement time=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Time : ']")));
		time.click();
		Thread.sleep(2000);	
		
		
		WebElement calender=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[@class=\"etn-widget-title etn-title\"]")));
		calender.click();
		Thread.sleep(2000);	
		WebElement scrol=driver.findElement(By.xpath("//h3[normalize-space()='Find Us']"));
		Actions act=new Actions(driver);
		act.moveToElement(scrol).build().perform();
		
		WebElement cnt=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"etn-event-content-body\"]")));
		cnt.click();
		Thread.sleep(2000);	
		
	

   }
	
	@AfterTest
	public void close()
	{
		driver.close();
	}
	
}
