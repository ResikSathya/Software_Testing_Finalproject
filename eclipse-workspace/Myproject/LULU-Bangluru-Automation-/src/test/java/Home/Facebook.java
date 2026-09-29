package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook {
	WebDriver driver=new EdgeDriver();
	@BeforeMethod
	public void navigator() throws InterruptedException
	{
		driver.get("https://www.bengaluru.lulumall.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test(description="Inavalid email and password")
	public void invalid() throws InterruptedException
	{
		 WebElement face = driver.findElement(By.xpath("(//i[@class='fab fa-facebook'])[1]"));
		face.click();
//		Thread.sleep(3000);
		WebElement email = driver.findElement(
			    By.xpath("//input[contains(@id,'_r_')and @name='email']"));	
		email.sendKeys("");
				
	}
	
	

}
