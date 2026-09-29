package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Instagram {
	WebDriver driver = new ChromeDriver();
	@BeforeMethod
	public void navigator() throws InterruptedException
	{
		driver.get("https://www.bengaluru.lulumall.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	@Test(description="Verify that the user can login insta using invalid credential")
	public void ins()
	{
		 WebElement inst = driver.findElement(By.xpath("(//i[@class='fab fa-instagram'])[1]"));
         inst.click();	
         Thread.sleep(3000);
         WebElement email=driver.findElement(By.xpath(null))
         }
}
