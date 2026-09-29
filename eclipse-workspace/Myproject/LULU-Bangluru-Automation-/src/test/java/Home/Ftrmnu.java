package Home;

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

public class Ftrmnu {
	WebDriver driver= new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	@BeforeMethod
	public void navigator() throws InterruptedException
	{
		driver.get("https://www.bengaluru.lulumall.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement our = driver.findElement(By.xpath("//a[normalize-space()='Terms and Condition']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.scrollToElement(our).perform();

	}
    @Test(description="Verify that the user can click on all menu headings in the footer")
		public void menu()
		{
			WebElement findus=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='Find Us']")));
			findus.click();
			WebElement followus=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='Follow Us ']")));
			followus.click();
			WebElement downloadus=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='Download our Apps']")));
			downloadus.click();
			WebElement contact=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='Contact']")));
			contact.click();
			WebElement links=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='Useful Links']")));
			links.click();
			WebElement mall=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='The Mall']")));
			mall.click();
			driver.quit();
		
		}
    @AfterTest()
    public void close()
    {
    	driver.quit();
    }
}
