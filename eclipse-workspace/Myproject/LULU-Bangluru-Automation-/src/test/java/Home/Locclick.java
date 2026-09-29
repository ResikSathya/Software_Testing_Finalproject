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

public class Locclick {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		@BeforeMethod
		public void navigator() throws InterruptedException
		{
			driver.get("https://www.bengaluru.lulumall.in/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			WebElement our = driver.findElement(By.xpath("//h2[text()='Our Shops ']"));
			Thread.sleep(3000);
			Actions act=new Actions(driver);
			act.scrollToElement(our).perform();
			
		}
		@Test(priority=1,description="Locationimages")
		public void location() throws InterruptedException
		{
			//Kochi
		WebElement kochi=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='attachment-medium size-medium wp-image-25508']")));
	     kochi.click();
	     Thread.sleep(3000);
	     driver.navigate().back();
	     //tvm
		WebElement tvm=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='attachment-1536x1536 size-1536x1536 wp-image-25525']")));
        tvm.click();
        Thread.sleep(3000);
	     driver.navigate().back();

	     //lucknow
        WebElement lucknow=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='attachment-1536x1536 size-1536x1536 wp-image-25526']")));
        lucknow.click();
        Thread.sleep(3000);
	     driver.navigate().back();

        //hyderabad
        WebElement hyderabad=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='attachment-1536x1536 size-1536x1536 wp-image-29018']")));
        hyderabad.click();
        Thread.sleep(3000);
	     driver.navigate().back();

        //palakkad
        WebElement palakkad=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='attachment-1536x1536 size-1536x1536 wp-image-28886']")));
        palakkad.click();
        Thread.sleep(3000);
	     driver.navigate().back();

        //kozhikkode
        WebElement kozhikkode=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='attachment-1536x1536 size-1536x1536 wp-image-29971']")));
        kozhikkode.click();
        Thread.sleep(3000);
	     driver.navigate().back();
        //kottayam
        WebElement kottayam=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='attachment-1536x1536 size-1536x1536 wp-image-30068']")));
        kottayam.click();
        Thread.sleep(3000);
        driver.close();
        
		}
}

