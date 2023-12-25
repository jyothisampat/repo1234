package NormalTestScript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignTestScript 
{
	
	@Test
	public void signtest()
	{
		//WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver:8084/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rmgyantra");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[.='Projects']")).click();
		List<WebElement> eles = driver.findElements(By.xpath("//td[1]"));
		
		for(WebElement ele: eles)
		{
			String projectid = "TY_PROJ_1288";
			if(ele.equals(projectid))
			{
				String pid = projectid;
				System.out.println(pid);
			}
	
		}
		System.out.println("project is present");
	}

}
