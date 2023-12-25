package moc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test1 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		WebElement ele1 = driver.findElement(By.id("mega-menu-item-5318"));
	ele1.click();
	Actions a = new Actions(driver);
		a.moveToElement(ele1).perform();
		WebElement ele = driver.findElement(By.id("mega-menu-item-5322"));
		ele.click();
		
	}

}
