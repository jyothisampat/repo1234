package moc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class emicalculator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://emicalculator.net/");
		Thread.sleep(1000);
		driver.manage().window().maximize();	
		WebElement ele = driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M 181.5604929141304 186.60634954541484 A 89.5 89.5 0 1 1 160.87568629554258 10.000086334662399 L 161 99.5 A 0 0 0 1 0 161 99.5 Z')]"));
		System.out.println(ele.getText());
	}

}
