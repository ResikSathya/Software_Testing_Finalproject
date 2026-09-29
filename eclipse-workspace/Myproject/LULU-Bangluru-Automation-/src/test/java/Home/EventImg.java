package Home;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EventImg {
	WebDriver driver= new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	@BeforeMethod
	public void navigator() throws InterruptedException
	{
		driver.get("https://www.bengaluru.lulumall.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement our = driver.findElement(By.xpath("//a[text()='Attend                            ']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.scrollToElement(our).perform();
		}
	@Test(priority=1,description="lulu wonder")
	public void Image() throws InterruptedException
	{
		WebElement wonder=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='etn-event-thumb'])[1]")));
		wonder.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement runway=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='etn-event-thumb'])[2]")));
		runway.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement flower=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='etn-event-thumb'])[3]")));
		flower.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement republic=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='etn-event-thumb'])[4]")));
		republic.click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.close();
	}

}
