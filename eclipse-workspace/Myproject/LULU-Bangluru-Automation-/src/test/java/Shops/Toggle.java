package Shops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Toggle {
	WebDriver driver;

    @BeforeMethod
    public void navigator() throws InterruptedException {

        driver = new ChromeDriver();

        driver.get("https://www.bengaluru.lulumall.in/shop-2/");

        driver.manage().window().maximize();

        Thread.sleep(3000);
    }
    

    @Test( description = "Toggle clicking")
    public void Togge() throws InterruptedException 
    {
    	
        WebElement tog = driver.findElement(
            By.xpath("//i[contains(@class,'fas fa-list')]"));

        tog.click();

        System.out.println("Toggle loaded");

        Thread.sleep(3000);
        
    }
    @AfterMethod
    public void close()
    {
    	driver.close();
    	
    }
    


}
