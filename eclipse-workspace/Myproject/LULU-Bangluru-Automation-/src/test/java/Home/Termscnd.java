package Home;

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

public class Termscnd {
	WebDriver driver= new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	@BeforeMethod
	public void navigator() throws InterruptedException
	{
		driver.get("https://www.bengaluru.lulumall.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement our = driver.findElement(By.xpath("//a[normalize-space()='Terms and Condition']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.scrollToElement(our).perform();

	}
	@Test(description="Verify that the user can click on the terms and conditions link")
	public void use() throws InterruptedException
	{
		WebElement privacy=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href=\"https://hyderabad.lulumall.in/terms-and-condition/\"]")));
		privacy.click();
		Thread.sleep(2000);
		driver.quit();
	}


}
