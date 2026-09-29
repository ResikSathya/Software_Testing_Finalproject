package ContactUS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Onefieldasempty {
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
		//lastname
		WebElement lastname = driver.findElement(By.xpath("//input[@id=\"form-field-lastname\"]"));
		lastname.sendKeys("Babu");
		//email
		WebElement email = driver.findElement(By.xpath("//input[@id=\"form-field-email\"]"));
		email.sendKeys("Babu@132.in");
		//phone
		WebElement phone = driver.findElement(By.xpath("//input[@id=\"form-field-phone\"]"));
		phone.sendKeys("9645061240");
		//select
		WebElement select = driver.findElement(By.xpath("//select[@class=\"elementor-field-textual elementor-size-md\"]"));
		select.click();
		Thread.sleep(2000);
		WebElement option = driver.findElement(By.xpath("//option[@value=\"Request or Query\"]"));
		option.click();
		//message
		WebElement message = driver.findElement(By.xpath("//textarea[@id=\"form-field-message\"]"));
		message.sendKeys("Happy Customer");
			
		
	}
	@Test(priority=2,description="lastname as empty")
	
	public void lasttname() throws InterruptedException
	{
		//lastname
		WebElement firstname = driver.findElement(By.xpath("//input[@id=\"form-field-name\"]"));
		firstname.sendKeys("Babu");
		//email
		WebElement email = driver.findElement(By.xpath("//input[@id=\"form-field-email\"]"));
		email.sendKeys("Babu@132.in");
		//phone
		WebElement phone = driver.findElement(By.xpath("//input[@id=\"form-field-phone\"]"));
		phone.sendKeys("9645061240");
		//select
		WebElement select = driver.findElement(By.xpath("//select[@class=\"elementor-field-textual elementor-size-md\"]"));
		select.click();
		Thread.sleep(2000);
		WebElement option = driver.findElement(By.xpath("//option[@value=\"Request or Query\"]"));
		option.click();
		//message
		WebElement message = driver.findElement(By.xpath("//textarea[@id=\"form-field-message\"]"));
		message.sendKeys("Happy Customer");
			
		
	}
	@Test(priority=3,description="Eamail field as empty")
	public void email() throws InterruptedException
	{
		//lastname
		WebElement firstname = driver.findElement(By.xpath("//input[@id=\"form-field-name\"]"));
		firstname.sendKeys("Babu");
		//lastname
		WebElement lastname = driver.findElement(By.xpath("//input[@id=\"form-field-lastname\"]"));
		lastname.sendKeys("Raj");
		//phone
		WebElement phone = driver.findElement(By.xpath("//input[@id=\"form-field-phone\"]"));
		phone.sendKeys("9645061240");
		//select
		WebElement select = driver.findElement(By.xpath("//select[@class=\"elementor-field-textual elementor-size-md\"]"));
		select.click();
		Thread.sleep(2000);
		WebElement option = driver.findElement(By.xpath("//option[@value=\"Request or Query\"]"));
		option.click();
		//message
		WebElement message = driver.findElement(By.xpath("//textarea[@id=\"form-field-message\"]"));
		message.sendKeys("Happy Customer");
			
		
	}
	@Test(priority=4,description="phone field as empty")
	public void phon() throws InterruptedException
	{
		//firstname
		WebElement firstname = driver.findElement(By.xpath("//input[@id=\"form-field-name\"]"));
		firstname.sendKeys("Babu");
		//lastname
		WebElement lastname = driver.findElement(By.xpath("//input[@id=\"form-field-lastname\"]"));
		lastname.sendKeys("Raj");
		//email
		WebElement email = driver.findElement(By.xpath("//input[@id=\"form-field-email\"]"));
		email.sendKeys("Babu@132.in");
		//phone
				WebElement phone = driver.findElement(By.xpath("//input[@id=\"form-field-phone\"]"));
				phone.sendKeys("9645061240");
		//select
		WebElement select = driver.findElement(By.xpath("//select[@class=\"elementor-field-textual elementor-size-md\"]"));
		select.click();
		Thread.sleep(2000);
		WebElement option = driver.findElement(By.xpath("//option[@value=\"Request or Query\"]"));
		option.click();
		
			
		
	}
	
	
	@AfterMethod
	public void contact() throws InterruptedException
	{
		
		WebElement tkn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		tkn.click();
		Thread.sleep(1000);
		

		
	
	}
	@AfterTest
	public void close()
	{
		driver.quit();
	}
}
