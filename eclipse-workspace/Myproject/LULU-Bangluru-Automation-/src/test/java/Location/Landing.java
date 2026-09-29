package Location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Landing {
	WebDriver driver=new ChromeDriver();
	@Test
	public void loc() throws InterruptedException
	{
		driver.get("https://www.lulumall.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement select=driver.findElement(By.xpath("//img[@class='attachment-large size-large wp-image-5297']"));
		select.click();
	}

}
