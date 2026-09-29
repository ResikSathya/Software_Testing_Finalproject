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

public class Itemdivclk {
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
		
		
	}
	@Test(description="Verify that the user can click all catagory section")
	public void controlslide() throws InterruptedException
	
	{
		WebElement anchor=driver.findElement(By.xpath("//section[@class=\"elementor-section elementor-inner-section elementor-element elementor-element-62059f1 elementor-section-boxed elementor-section-height-default elementor-section-height-default\"]"));
		anchor.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement beauty=driver.findElement(By.xpath("//section[@class=\"elementor-section elementor-inner-section elementor-element elementor-element-4188a58 elementor-section-boxed elementor-section-height-default elementor-section-height-default\"]"));
        beauty.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//cafe
		WebElement cafe=driver.findElement(By.xpath("//section[@class='elementor-section elementor-inner-section elementor-element elementor-element-d108110 elementor-section-boxed elementor-section-height-default elementor-section-height-default']"));
		cafe.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//Entertainment
		WebElement Entertainment=driver.findElement(By.xpath("//section[@class='elementor-section elementor-inner-section elementor-element elementor-element-777da47 elementor-section-boxed elementor-section-height-default elementor-section-height-default']"));
		Entertainment.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//kids
		WebElement kids=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@class='elementor-section elementor-inner-section elementor-element elementor-element-c247712 elementor-section-boxed elementor-section-height-default elementor-section-height-default']")));
		kids.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//footwear
		WebElement footwear=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@class='elementor-section elementor-inner-section elementor-element elementor-element-cf51801 elementor-section-boxed elementor-section-height-default elementor-section-height-default']")));
		footwear.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//home
		WebElement app=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@class='elementor-section elementor-inner-section elementor-element elementor-element-00506d6 elementor-section-boxed elementor-section-height-default elementor-section-height-default']")));
		app.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//sports
		WebElement sports=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@class='elementor-section elementor-inner-section elementor-element elementor-element-c735622 elementor-section-boxed elementor-section-height-default elementor-section-height-default']")));
		sports.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//travel
		WebElement travel=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@class='elementor-section elementor-inner-section elementor-element elementor-element-c62dcac elementor-section-boxed elementor-section-height-default elementor-section-height-default']")));
		travel.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//mobile
		WebElement swipe=driver.findElement(By.xpath("//img[@title='womens fashion']"));
		Actions act=new Actions(driver);
		act.moveToElement(swipe).build().perform();
		WebElement mob=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@class='elementor-section elementor-inner-section elementor-element elementor-element-989c9dc elementor-section-boxed elementor-section-height-default elementor-section-height-default']")));
		mob.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//book
		WebElement book=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@class='elementor-section elementor-inner-section elementor-element elementor-element-f09e424 elementor-section-boxed elementor-section-height-default elementor-section-height-default']")));
		book.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//food
		WebElement food=driver.findElement(By.xpath("//section[@class='elementor-section elementor-inner-section elementor-element elementor-element-21ae1f8 elementor-section-boxed elementor-section-height-default elementor-section-height-default']"));
		food.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//watch
		WebElement watch=driver.findElement(By.xpath("//section[@class='elementor-section elementor-inner-section elementor-element elementor-element-8b06c70 elementor-section-boxed elementor-section-height-default elementor-section-height-default']"));
		watch.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//eye
		WebElement eye=driver.findElement(By.xpath("//section[@class='elementor-section elementor-inner-section elementor-element elementor-element-7646247 elementor-section-boxed elementor-section-height-default elementor-section-height-default']"));
		eye.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//kiosk
		WebElement kiosk=driver.findElement(By.xpath("//section[@class='elementor-section elementor-inner-section elementor-element elementor-element-e95e1cf elementor-section-boxed elementor-section-height-default elementor-section-height-default']"));
		kiosk.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//health
		WebElement health=driver.findElement(By.xpath("//section[@class='elementor-section elementor-inner-section elementor-element elementor-element-6e6dc32 elementor-section-boxed elementor-section-height-default elementor-section-height-default']"));
		health.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//jewellary
		WebElement jewellary=driver.findElement(By.xpath("//section[@class='elementor-section elementor-inner-section elementor-element elementor-element-7282564 elementor-section-boxed elementor-section-height-default elementor-section-height-default']"));
		jewellary.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//Toys
		WebElement Toys=driver.findElement(By.xpath("//section[@class='elementor-section elementor-inner-section elementor-element elementor-element-b19ca59 elementor-section-boxed elementor-section-height-default elementor-section-height-default']"));
		Toys.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//men
		WebElement slide=driver.findElement(By.xpath("//section[@class=\"elementor-section elementor-top-section elementor-element elementor-element-42dba8d elementor-section-boxed elementor-section-height-default elementor-section-height-default\"]"));
		Actions scrl=new Actions(driver);
		scrl.moveToElement(slide).build().perform();
		WebElement men=driver.findElement(By.xpath("//section[@class='elementor-section elementor-inner-section elementor-element elementor-element-d7c0b06 elementor-section-boxed elementor-section-height-default elementor-section-height-default']"));
        men.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//women
		WebElement women=driver.findElement(By.xpath("//section[@class='elementor-section elementor-inner-section elementor-element elementor-element-df5074d elementor-section-boxed elementor-section-height-default elementor-section-height-default' ]"));
        women.click();
        Thread.sleep(2000);
		
		
		
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
	

}
