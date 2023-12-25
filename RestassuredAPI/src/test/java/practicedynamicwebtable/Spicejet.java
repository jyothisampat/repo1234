package practicedynamicwebtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://corporate.spicejet.com/Default.aspx");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='One Way']/parent::td")).click();
		Thread.sleep(1000);
		
		WebElement departure = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1"));
		departure.click();
		Select s = new Select(departure);
		s.selectByVisibleText("Bengaluru");
		Thread.sleep(1000);
		WebElement tocity = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1"));
		tocity.click();
		Select s1 = new Select(tocity);
		s1.selectByVisibleText("Belagavi");
		
		Thread.sleep(1000);
	
	}

}
