package Dine;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Locpopup {
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	@BeforeMethod(description="Verify that the user can click on all locations after hovering the location link")
	public void navigator() throws InterruptedException 
	{
		driver.get("https://www.bengaluru.lulumall.in/dine/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement loc=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"hfe-menu-item\" and @href=\"http://13.126.115.44/\"]")));
        Thread.sleep(2000);
		Actions action =new Actions(driver);
         action.moveToElement(loc).perform();
         Thread.sleep(3000);
	}
	@Test(priority=1,description="kochi")
	public void kochi() throws InterruptedException
	{
		
			
	         WebElement kochi=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Kochi']")));
	         kochi.click();
	         wait.until(ExpectedConditions.urlContains("kochi"));
	         Thread.sleep(2000);
	         driver.navigate().back();
		
	}
	@Test(priority=2,description="Thiruvananthapuram")
	public void thiruvananthapuram() throws InterruptedException
	{
		
			
	         WebElement Thiruvananthapuram=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Thiruvananthapuram']")));
	         Thiruvananthapuram.click();
	         wait.until(ExpectedConditions.urlContains("thiruvananthapuram"));
	         Thread.sleep(2000);
	         driver.navigate().back();
		
	}
	@Test(priority=3,description="lucknow")
	public void lucknow() throws InterruptedException
	{
		
			
	         WebElement Lucknow=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Lucknow']")));
	         Lucknow.click();
	         wait.until(ExpectedConditions.urlContains("lucknow"));
	         Thread.sleep(2000);
	         driver.navigate().back();

		
	}
	@Test(priority=4,description="Hyderabad")
	public void hyderabad() throws InterruptedException
	{
		
			
	         WebElement Hyderabad=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Hyderabad']")));
	         Hyderabad.click();
	         wait.until(ExpectedConditions.urlContains("hyderabad"));
	         Thread.sleep(2000);
	         driver.navigate().back();

		
	}
	@Test(priority=5,description="palakkad")
	public void palakkad() throws InterruptedException
	{
		
			
	         WebElement Palakkad=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Palakkad']")));
	         Palakkad.click();
	         wait.until(ExpectedConditions.urlContains("palakkad"));
	         Thread.sleep(2000);
	         driver.navigate().back();

		
	}
	@Test(priority=6,description="kozhikode")
	public void kozhikode() throws InterruptedException
	{
		
			
	         WebElement Kozhikode=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Kozhikode']")));
	         Kozhikode.click();
	         wait.until(ExpectedConditions.urlContains("kozhikode"));
	         Thread.sleep(2000);
	         driver.navigate().back();

		
	}
	@Test(priority=7,description="kottayam")
	public void kottayam() throws InterruptedException
	{
		
			
	         WebElement Kottayam=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Kottayam']")));
	         Kottayam.click();
	         wait.until(ExpectedConditions.urlContains("kottayam"));
	         Thread.sleep(2000);
	         driver.navigate().back();

		
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
	
}
