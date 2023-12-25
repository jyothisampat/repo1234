package Udemypractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		/*driver.get("https://jqueryui.com/droppable/");
	
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		//driver.findElement(By.xpath("//a[.='Draggable']")).click();
		Actions a = new Actions(driver);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dst = driver.findElement(By.id("droppable"));
		a.dragAndDrop(src, dst).build().perform();
		driver.switchTo().defaultContent();*/
		Thread.sleep(2000);
		driver.get("https://www.fifa.com/fifaplus/en/tournaments/womens/womensworldcup/australia-new-zealand2023");	
		Thread.sleep(2000);
		driver.findElement(By.id("onetrust-reject-all-handler")).click();
		driver.findElement(By.xpath("//div[@class='pop-up_closeIcon__2EMoq']")).click();
		
		//div[@class='global-menu-top-nav_link__gg_sF']//a[.='SCORES & FIXTURES']
		driver.findElement(By.xpath("//div[@class='global-menu-top-nav_link__gg_sF']/child::a[.='SCORES & FIXTURES']")).click();
		
		
		
		
		
		
	}

}
