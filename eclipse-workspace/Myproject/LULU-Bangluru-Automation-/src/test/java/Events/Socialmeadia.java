package Events;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Socialmeadia {

    WebDriver driver;

    @BeforeMethod
    public void navigator() throws InterruptedException {

        driver = new ChromeDriver();

		driver.get("https://www.bengaluru.lulumall.in/events-2/");

        driver.manage().window().maximize();

        Thread.sleep(3000);
    }

    @Test(priority = 1, description = "Facebook clicking")
    public void facebook() throws InterruptedException {

        WebElement face = driver.findElement(
            By.xpath("(//i[@class='fab fa-facebook'])[1]")
        );

        face.click();

        System.out.println("Facebook loaded");

        Thread.sleep(3000);
    }

    @Test(priority = 2, description = "Instagram clicking")
    public void insta() throws InterruptedException {
    	Thread.sleep(5000);

        WebElement inst = driver.findElement(
            By.xpath("(//i[@class='fab fa-instagram'])[1]")
        );

        inst.click();

        System.out.println("Instagram Loaded");

        Thread.sleep(3000);
    }

    @AfterMethod
    public void close() {

        driver.quit();

    }

}
