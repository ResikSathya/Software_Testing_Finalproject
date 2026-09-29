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

public class Shopname {
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
		WebElement anchor=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Anchor Store']")));
		anchor.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement beauty=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Beauty & Wellness']")));
        beauty.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//cafe
		WebElement cafe=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Cafe / Restaurants']")));
		cafe.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//Entertainment
		WebElement Enter=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='Entertainment'])[2]")));
		Enter.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//kids
		WebElement kids=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@href=\"http://bengaluru.lulumall.in/shop-2/kids-wear/\"])[2]")));
		kids.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//footwear
		WebElement footwear=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Footwear / Bags']")));
		footwear.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//home
		WebElement app=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Home / Lifestyle']")));
		app.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//sports
		WebElement sports=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Sports & Performance Wear']")));
		sports.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//travel
		WebElement travel=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Travel Luggage']")));
		travel.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//mobile
		WebElement swipe=driver.findElement(By.xpath("//img[@title='womens fashion']"));
		Actions act=new Actions(driver);
		act.moveToElement(swipe).build().perform();
		WebElement mob=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Mobile / Electronics']")));
		mob.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//book
		WebElement book=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Book / Gifts']")));
		book.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//food
		WebElement food=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Food Court']")));
		food.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//watch
		WebElement watch=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Watches']")));
		watch.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//eye
		WebElement eye=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Eye Wear']")));
		eye.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//kiosk
		WebElement kiosk=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Kiosk']")));
		kiosk.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//health
		WebElement health=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Health Wellness']")));
		health.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//jewellary
		WebElement jewellary=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Jewellery']")));
		jewellary.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//Toys
		WebElement Toys=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Toys']")));
		Toys.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//men
		WebElement slide=driver.findElement(By.xpath("//section[@class=\"elementor-section elementor-top-section elementor-element elementor-element-42dba8d elementor-section-boxed elementor-section-height-default elementor-section-height-default\"]"));
		Actions scrl=new Actions(driver);
		scrl.moveToElement(slide).build().perform();
		WebElement men=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@href=\"http://bengaluru.lulumall.in/shop-2/mens-fashion/\"])[2]")));
        men.click();
        Thread.sleep(2000);
		driver.navigate().back();
		//women
		WebElement women=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@href=\"http://bengaluru.lulumall.in/shop-2/womens-fashion/\"])[2]")));
        women.click();
        Thread.sleep(2000);
		

}
	@AfterTest
	public void close()
	{
		driver.close();
	}
}



