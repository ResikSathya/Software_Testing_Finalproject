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

public class EvntDates {
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
	@Test(description="Verify that the user can click on all dates under the event image")
	public void dates() throws InterruptedException
	{
	WebElement wonder = wait.until(
		    ExpectedConditions.elementToBeClickable(
		        By.xpath("//span[contains(normalize-space(),'March 10, 2024')]")
		    )
		);

		wonder.click();
		Thread.sleep(2000);



		WebElement runway = wait.until(
		    ExpectedConditions.elementToBeClickable(
		        By.xpath("//span[contains(normalize-space(),'February 25, 2024')]")
		    )
		);

		runway.click();
		Thread.sleep(2000);


		WebElement flower = wait.until(
		    ExpectedConditions.elementToBeClickable(
		        By.xpath("//span[contains(normalize-space(),'February 19, 2024')]")
		    )
		);

		flower.click();
		Thread.sleep(2000);



		WebElement republic = wait.until(
		    ExpectedConditions.elementToBeClickable(
		        By.xpath("//span[contains(normalize-space(),'January 26, 2024')]")
		    )
		);

		republic.click();
		Thread.sleep(2000);


		driver.quit();
}
}
