package Home;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Viewshops {
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	@BeforeMethod
	public void navigator() throws InterruptedException
	{
		driver.get("https://www.bengaluru.lulumall.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 WebElement our = wait.until(
			        ExpectedConditions.visibilityOfElementLocated(
			            By.xpath("//h2[normalize-space()='Our Events']")));	
			            Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.scrollToElement(our).perform();
		Thread.sleep(3000);
		
	}
	@Test(priority = 1, description = "Shop slide")
	public void select() throws InterruptedException {

	    WebElement shop = wait.until(
	        ExpectedConditions.elementToBeClickable(
	            By.xpath("(//a[@class='swiper-slide-inner' and contains(@href,'shop-2')])[1]")
	        )
	    );

	    shop.click();

	    Thread.sleep(2000);
	}
	@Test(priority = 2, description = "Entertainment")
	public void secslide() throws InterruptedException {

	    WebElement left = wait.until(
	        ExpectedConditions.elementToBeClickable(
	            By.xpath("//i[@class='eicon-chevron-left']")
	        )
	    );

	    left.click();

	    Thread.sleep(1000);

	    WebElement enter = wait.until(
	        ExpectedConditions.elementToBeClickable(
	            By.xpath("(//a[contains(@href,'entertainment')])[2]")
	        )
	    );

	    enter.click();

	    Thread.sleep(2000);
	}
	@Test(priority=3,description="Dine ")
    public void thirdslide() throws InterruptedException
    {
		WebElement left=driver.findElement(By.xpath("//i[@class='eicon-chevron-left']"));
		left.click();
		left.click();
		WebElement enter=driver.findElement(By.xpath("(//a[@href='https://bengaluru.lulumall.in/dine/'])[1]"));
		enter.click();
		Thread.sleep(2000);


    }
	@AfterTest
public void close()
{
	driver.close();
}

}
