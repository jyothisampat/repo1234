package practicedynamicwebtable;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamicwebtavle 
{
	public static void main(String[] args) throws InterruptedException
	{
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	Thread.sleep(1000);
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.opencart.com/admin/index.php");
	Thread.sleep(1000);
	driver.manage().window().maximize();	
	
	//login to application
	WebElement usn = driver.findElement(By.id("input-username"));
	usn.clear();
	usn.sendKeys("demo");
	Thread.sleep(1000);
	WebElement psw = driver.findElement(By.id("input-password"));
	psw.clear();
	psw.sendKeys("demo");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	Thread.sleep(1000);
	//Alert a = driver.switchTo().alert();
	//a.accept();
	Thread.sleep(1000);
	//WebElement btn = driver.findElement(By.xpath("//button[@class='btn-close']"));
	//Thread.sleep(1000);
	//btn.click();////button[@data-bs-dismiss='modal']
	driver.get("https://demo.opencart.com/admin/index.php?route=common/dashboard&user_token=ae6da3a0262304a77a2d98886e45f9e8");
	Thread.sleep(1000);
	//sales-------->order
	
	
	
	}
}
