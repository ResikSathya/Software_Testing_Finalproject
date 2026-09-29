package ContactUS;

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

public class Fusefulclks {
	WebDriver driver= new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	@BeforeMethod
	public void navigator() throws InterruptedException
	{
		driver.get("https://www.bengaluru.lulumall.in/contact-us/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement our = driver.findElement(By.xpath("//a[normalize-space()='Terms and Condition']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.scrollToElement(our).perform();

	}
	@Test(description="Verify that the user can click on all links under con tact menu")
	public void use() throws InterruptedException
	{
		WebElement first=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Offers']")));
		first.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement scnd=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Lulu Group International ']")));
		scnd.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement thrd=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Mall Timings ']")));
		thrd.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement frth=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Floor Plans ']")));
		frth.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement fifth=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Floor Plans ']")));
		fifth.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement sixth=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Services']")));
		sixth.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement seven=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='POSH Policy']")));
		seven.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
}