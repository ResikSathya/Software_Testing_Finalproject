package Entertainment;

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

public class Followus {
	WebDriver driver= new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	@BeforeMethod
	public void navigator() throws InterruptedException
	{
		driver.get("https://www.bengaluru.lulumall.in/entertainment/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement our = driver.findElement(By.xpath("//a[normalize-space()='Terms and Condition']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.scrollToElement(our).perform();

	}
	@Test(description="Verify that the user can click on all links under the follow us")
	public void use() throws InterruptedException
	{
		WebElement first=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"elementor-icon elementor-social-icon elementor-social-icon-facebook elementor-animation-pop elementor-repeater-item-006dc72\"]")));
		first.click();
		Thread.sleep(2000);
		WebElement scnd=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"elementor-icon elementor-social-icon elementor-social-icon-instagram elementor-animation-pop elementor-repeater-item-03a759d\"]")));
		scnd.click();
		Thread.sleep(2000);
		
	}
	@AfterTest
	public void close()
	{
		driver.quit();
	}
}
