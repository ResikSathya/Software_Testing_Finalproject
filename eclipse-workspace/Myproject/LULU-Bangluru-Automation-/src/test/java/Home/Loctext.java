package Home;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loctext {
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	@BeforeTest
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
	@Test(priority=1,description="Kochi")
	public void kochi() throws InterruptedException
	{
		//Kochi
	WebElement kochi=driver.findElement(By.xpath("//figcaption[text()='Kochi']"));
     kochi.click();
     Thread.sleep(3000);
	}
	@Test(priority=2,description="tvm")
	public void tvm() throws InterruptedException
	{
     //tvm
	WebElement tvm=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//figcaption[text()='Thiruvananthapuram']")));
    tvm.click();
    Thread.sleep(3000);
	}
	@Test(priority=3,description="lucknow")
	public void lucknow() throws InterruptedException
	{
     //lucknow
    WebElement lucknow=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//figcaption[text()='Lucknow']")));
    lucknow.click();
    Thread.sleep(3000);
	}
	@Test(priority=4,description="hyderabad")
	public void hyderabad() throws InterruptedException
	{
    //hyderabad
    WebElement hyderabad=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//figcaption[text()='Hyderabad']")));
    hyderabad.click();
    Thread.sleep(3000);

	}
	@Test(priority=5,description="palakkad")
	public void palakkad() throws InterruptedException
	{
    //palakkad
    WebElement palakkad=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//figcaption[text()='Palakkad']")));
    palakkad.click();
    Thread.sleep(3000);
	}
	@Test(priority=6,description="kozhikkode")
	public void kozhikkode() throws InterruptedException
	{
    //kozhikkode
    WebElement kozhikkode=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//figcaption[text()='Kozhikode']")));
    kozhikkode.click();
    Thread.sleep(3000);
	}
	@Test(priority=7,description="kottayam")
	public void kottayam() throws InterruptedException
	{
    //kottayam
    WebElement kottayam=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//figcaption[text()='Kottayam']")));
    kottayam.click();
    Thread.sleep(3000);
   
	}
    @AfterTest
    public void close()
    {
    	driver.close();
    }
}


