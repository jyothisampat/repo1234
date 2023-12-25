package amazon;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("Samsung s20");
		//Actions a = new Actions(driver);
		//WebElement ele = driver.findElement(By.xpath("//div[@data-tkid='6c21d352-393d-48b3-805d-3c1c76d5cb68.samsung s20 fe|Mobiles']"));
		//a.moveToElement(ele);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	}

}
