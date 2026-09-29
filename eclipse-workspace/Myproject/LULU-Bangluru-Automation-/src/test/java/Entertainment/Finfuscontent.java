package Entertainment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Finfuscontent {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	SoftAssert assertion=new SoftAssert();
@BeforeMethod
public void navigator() throws InterruptedException
{
	driver.get("https://www.bengaluru.lulumall.in/entertainment/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement our = driver.findElement(By.xpath("//a[normalize-space()='Terms and Condition']"));
	Thread.sleep(3000);
	Actions act=new Actions(driver);
	act.scrollToElement(our).perform();
	
}	
	
	@Test(description="Verify that correct content against requirement is showing on site")
	public void cont() {

	    WebElement content = wait.until(
	        ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("//p[contains(text(),'Lulu International Shopping Malls Pvt Ltd')]")
	        )
	    );

	    String displayed_content = content.getText();

	    String Original_content =
	          "Lulu International Shopping Malls Pvt Ltd.\r\n"
	        + "No 19/2, Part of CTS No 2, Mysore Deviation Road, Gopalapura(Ward No 96)\r\n"
	        + "Opposite Sujata Theatre, Rajaji Nagar, Bengaluru 560023";

	    assertion.assertEquals(displayed_content, Original_content);

	    assertion.assertAll();
	}
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
}
