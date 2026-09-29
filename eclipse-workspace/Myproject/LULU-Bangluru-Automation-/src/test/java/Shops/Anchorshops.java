package Shops;

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

public class Anchorshops {
	WebDriver driver =new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	@BeforeMethod
	public void navigator() throws InterruptedException
	{
		driver.get("https://www.bengaluru.lulumall.in/shop-2/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement scroll=driver.findElement(By.xpath("//section[@class='elementor-section elementor-inner-section elementor-element elementor-element-c62dcac elementor-section-boxed elementor-section-height-default elementor-section-height-default']"));
		Actions act=new Actions(driver);
		act.moveToElement(scroll).build().perform();
		WebElement anchor=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title=\"unnamed-removebg-preview\"]")));
		anchor.click();
		Thread.sleep(2000);
		
	}
	@Test(description="Verify that the user can click all images after clicking Anchorstore")
	public void shops() throws InterruptedException
	
	{
		WebElement anchor=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"elementor-post__thumbnail__link\"])[1]")));
		anchor.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement lfs=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"elementor-post__thumbnail__link\"])[2]")));
		lfs.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement azorte=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"elementor-post__thumbnail__link\"])[3]")));
		azorte.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement scrol=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"elementor-post__thumbnail__link\"])[6]")));
        Actions act= new Actions(driver);
        act.scrollToElement(scrol).build().perform();
		WebElement zudio=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"elementor-post__thumbnail__link\"])[4]")));
		zudio.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement westside=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"elementor-post__thumbnail__link\"])[5]")));
		westside.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement trends=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"elementor-post__thumbnail__link\"])[6]")));
		trends.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement slide=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"elementor-post__thumbnail__link\"])[9]")));
        Actions sw= new Actions(driver);
        sw.scrollToElement(slide).build().perform();
		WebElement rb=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"elementor-post__thumbnail__link\"])[7]")));
		rb.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement pentloon=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"elementor-post__thumbnail__link\"])[8]")));
		pentloon.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement max=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\"elementor-post__thumbnail__link\"])[9]")));
		max.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement loo=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Terms and Condition']")));
		Actions sld=new Actions(driver);
		sld.scrollToElement(loo);
		WebElement loon=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@href=\"https://www.bengaluru.lulumall.in/shop/lulu-hypermarket/\"])[1]")));
		loon.click();
		Thread.sleep(2000);
		
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
}
