package Udemypractice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StandAloneTest
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		Thread.sleep(1000);
		driver.findElement(By.id("userEmail")).sendKeys("jyothimb@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Jyothi_2396");
		driver.findElement(By.id("login")).click();
		Thread.sleep(1000);
		WebElement cart_btn = driver.findElement(By.xpath("//div[@class='card']/descendant::b[.='zara coat 3']/parent::h5/following-sibling::button/descendant::i[@class='fa fa-shopping-cart']"));
		Thread.sleep(1000);
		cart_btn.click();
		Thread.sleep(1000);
		WebElement cart = driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']"));
		Thread.sleep(1000);
		cart.click();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Let's Shop");
		System.out.println("test case is pass");
		driver.findElement(By.xpath("//button[.='Checkout']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("india");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='button']/descendant::i)[2]")).click();
		driver.findElement(By.xpath("//a[.='Place Order ']")).click();
		String curl = driver.getCurrentUrl();
		System.out.println(curl);
		Assert.assertTrue(curl, true);
	driver.findElement(By.xpath("//button[@routerlink='/dashboard/myorders']")).click();
	System.out.println("test case is pass");
	driver.close();
	
	}

}
