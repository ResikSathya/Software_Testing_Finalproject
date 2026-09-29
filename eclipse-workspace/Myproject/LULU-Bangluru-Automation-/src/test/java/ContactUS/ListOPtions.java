package ContactUS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ListOPtions {
	WebDriver driver= new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	@BeforeMethod
	public void navigator() throws InterruptedException
	{
		driver.get("https://www.bengaluru.lulumall.in/contact-us/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement token = driver.findElement(By.xpath("(//h3[@class=\"elementor-heading-title elementor-size-default\"])[1]"));
		Actions act=new Actions(driver);
		act.scrollToElement(token).perform();
		Thread.sleep(3000);
	}
	@Test(description="Verify that the user can click on get token any one of the field as empty")
	//first name as empty
	public void firstname() throws InterruptedException
	{
		//select
		WebElement select = driver.findElement(By.xpath("//select[@class=\"elementor-field-textual elementor-size-md\"]"));
		select.click();
		Thread.sleep(2000);
		WebElement option1 = driver.findElement(By.xpath("//option[@value=\"Request or Query\"]"));
		option1.click();
		Thread.sleep(2000);
		
		WebElement option2 = driver.findElement(By.xpath("//option[@value=\"Customer Feedback\"]"));
		option2.click();
		Thread.sleep(2000);
		WebElement option3 = driver.findElement(By.xpath("//option[@value=\"Promotion/Event\"]"));
		option3.click();
		Thread.sleep(2000);
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
}


