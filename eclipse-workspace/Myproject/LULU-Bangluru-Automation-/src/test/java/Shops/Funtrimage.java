package Shops;

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

public class Funtrimage {
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
	@Test(description="Verify that the user can click on funture image")
	
		public void funture() throws InterruptedException
		{
		WebElement anchor=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@href=\"https://www.bengaluru.lulumall.in/shop/funtura-2/\"])[3]")));
		anchor.click();
		Thread.sleep(2000);	
		WebElement img=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class=\"attachment-large size-large wp-image-30668\"]")));
        img.click();
        driver.close();
		}
	}


