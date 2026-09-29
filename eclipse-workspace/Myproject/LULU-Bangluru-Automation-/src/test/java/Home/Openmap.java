package Home;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Openmap {
	WebDriver driver= new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	@BeforeMethod
	public void navigator() throws InterruptedException
	{
		driver.get("https://www.bengaluru.lulumall.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement our = driver.findElement(By.xpath("//h3[text()='Find Us']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.scrollToElement(our).perform();
		Thread.sleep(2000);
		}
	@Test(description="Verify that the user can click on Open the map")
	public void map() throws InterruptedException
	{
		// 1. Switch to Google Maps iframe
		WebElement mapIframe = driver.findElement(By.xpath("//iframe[contains(@src, 'google.com/maps')]"));
		driver.switchTo().frame(mapIframe);

		// 2. Access the Shadow DOM Host & find the element using CSS Selector
		WebElement shadowHost = driver.findElement(By.tagName("embed-place-card-element"));
		SearchContext shadowRoot = shadowHost.getShadowRoot();

		// 3. Click the link
		WebElement openInMapsBtn = shadowRoot.findElement(By.cssSelector("a[aria-label^='Open in Maps']"));
		openInMapsBtn.click();

		driver.quit();
		
		
	}


}
