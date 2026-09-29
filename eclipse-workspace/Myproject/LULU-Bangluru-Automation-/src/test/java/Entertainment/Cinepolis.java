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

public class Cinepolis {
	WebDriver driver= new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));

	
	@BeforeMethod
	public void navigator() throws InterruptedException
	{
		driver.get("https://www.bengaluru.lulumall.in/entertainment/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement act=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@class=\"elementor-section elementor-top-section elementor-element elementor-element-6c181aa elementor-section-boxed elementor-section-height-default elementor-section-height-default\"]")));
		Actions scrl= new Actions(driver);
		scrl.moveToElement(act).build().perform();
	}
	@Test(priority=1, description="Verify that the user can click on image of cinepolis")
	public void img() throws InterruptedException
	{
		WebElement left=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class=\"attachment-large size-large wp-image-28196\"]")));
		left.click();
		Thread.sleep(2000);

    }
	@Test(priority=2, description="Verify that the user can click on name of cinepolis")
	public void name() throws InterruptedException
	{
		WebElement left=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//h2[@class=\"elementor-heading-title elementor-size-default\"])[2]")));
		left.click();
		Thread.sleep(2000);
	}
	@Test(priority=3, description="Verify that the user can click on content of cinepolis")
	public void cont() throws InterruptedException
	{
		
			WebElement left=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Cinépolis was founded in Mexico in the city of Morelia')]")));
			left.click();
			Thread.sleep(2000);
		
	}
	@Test(priority=4, description="Verify that the user can click on Book button to load cinepolis site")
	public void book() throws InterruptedException
	{
		WebElement left=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"elementor-button elementor-button-link elementor-size-sm\"])[2]")));
		left.click();
		Thread.sleep(2000);
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
