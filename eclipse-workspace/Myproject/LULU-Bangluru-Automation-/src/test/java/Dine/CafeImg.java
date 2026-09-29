package Dine;

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

public class CafeImg {
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	@BeforeMethod(description="Verify that the user can click on image after clicking cafe/restuarent")
	public void navigator() throws InterruptedException 
	{
		driver.get("https://www.bengaluru.lulumall.in/dine/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement scrol=driver.findElement(By.xpath("//h3[normalize-space()='Find Us']"));
		Actions act=new Actions(driver);
		act.scrollToElement(scrol).build().perform();
		Thread.sleep(2000);
		WebElement frst =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Cafe / Restaurants']")));
		frst.click();
		Thread.sleep(2000);
		
		
		
		
		
				
	}

	@Test
	public void slide() throws InterruptedException
	{
		WebElement frst =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"elementor-post__thumbnail__link\"])[1]")));
		frst.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement scnd =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"elementor-post__thumbnail__link\"])[2]")));
		scnd.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement scrol=driver.findElement(By.xpath("//h3[normalize-space()='Find Us']"));
		Actions act=new Actions(driver);
		act.scrollToElement(scrol).build().perform();
		WebElement thrd =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"elementor-post__thumbnail__link\"])[3]")));
		thrd.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement frth =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"elementor-post__thumbnail__link\"])[4]")));
		frth.click();
		Thread.sleep(2000);
		driver.close();
		
	}
}
