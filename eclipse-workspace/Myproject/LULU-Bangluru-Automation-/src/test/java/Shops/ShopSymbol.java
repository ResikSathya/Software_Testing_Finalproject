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

public class ShopSymbol {
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
		WebElement anchor=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title=\"unnamed-removebg-preview\"]")));
		anchor.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement beauty=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title='beayty and wellness']")));
        beauty.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//cafe
		WebElement cafe=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title='cafe restaurants']")));
		cafe.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//Entertainment
		WebElement Entertainment=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title=\"entertainment\"]")));
		Entertainment.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//kids
		WebElement kids=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title=\"kids wear\"]")));
		kids.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//footwear
		WebElement footwear=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title=\"foot wear bags\"]")));
		footwear.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//home
		WebElement app=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title=\"home lifestyle\"]")));
		app.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//sports
		WebElement sports=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title=\"sports performance\"]")));
		sports.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//travel
		WebElement travel=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title=\"travell luggage\"]")));
		travel.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//mobile
		WebElement swipe=driver.findElement(By.xpath("//img[@title='womens fashion']"));
		Actions act=new Actions(driver);
		act.moveToElement(swipe).build().perform();
		WebElement mob=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title=\"mobile electronics\"]")));
		mob.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//book
		WebElement book=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title=\"book gift\"]")));
		book.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//food
		WebElement food=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title=\"food court\"]")));
		food.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//watch
		WebElement watch=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title='watches']")));
		watch.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//eye
		WebElement eye=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title='eye wear']")));
		eye.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//kiosk
		WebElement kiosk=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title='kiosk']")));
		kiosk.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//health
		WebElement health=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title='health wellness']")));
		health.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//jewellary
		WebElement jewellary=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title='jewellery']")));
		jewellary.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//Toys
		WebElement Toys=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title='toys']")));
		Toys.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//men
		WebElement slide=driver.findElement(By.xpath("//section[@class=\"elementor-section elementor-top-section elementor-element elementor-element-42dba8d elementor-section-boxed elementor-section-height-default elementor-section-height-default\"]"));
		Actions scrl=new Actions(driver);
		scrl.moveToElement(slide).build().perform();
		WebElement men=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title='mens fashion']")));
        men.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//women
		WebElement women=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title='womens fashion']")));
        women.click();
        Thread.sleep(2000);
		

}
	@AfterTest
	public void close()
	{
		driver.close();
	}
}
