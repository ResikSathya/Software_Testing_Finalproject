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

public class Cataimg {
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	@BeforeMethod(description="Verify that the user can click on the catagory section")
	public void navigator() throws InterruptedException 
	{
		driver.get("https://www.bengaluru.lulumall.in/dine/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement scrol=driver.findElement(By.xpath("//h3[normalize-space()='Find Us']"));
		Actions act=new Actions(driver);
		act.scrollToElement(scrol).build().perform();
				
	}

	@Test
	public void slide() throws InterruptedException
	{
		WebElement frst =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title=\"food court\"]")));
		frst.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement scnd =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title=\"cafe restaurants\"]")));
		scnd.click();
		driver.close();
	}

}
