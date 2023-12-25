package NormalTestScript;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class createprojectTestScript
{
	@Test
	public void crtproj() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver:8084/");
		Thread.sleep(2000);
		Random ran= new Random();
		int ranNo=ran.nextInt(1000);
		String proj="Onlinebanking525345"+ranNo;
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rmgyantra");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Projects")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Create Project']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys(proj);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='teamSize']")).sendKeys("6");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("jyothi1");
		Thread.sleep(4000);
		/*WebElement ele = driver.findElement(By.xpath("//option[.='Select Value']"));
		ele.click();
		Select s = new Select(ele);
		s.selectByIndex(1);
		Thread.sleep(2000);*/
		driver.findElement(By.xpath("//input[@value='Add Project']")).click();
		
		System.out.println("********************");
		Thread.sleep(2000);
		 WebElement actData = driver.findElement(By.xpath("//td[.='"+proj+"']/preceding-sibling::td"));
		 Thread.sleep(2000);
		 String text = actData .getText();
		 
		System.out.println(text);
		Response resp = RestAssured.given().pathParam("pid",text).when().get("/projects/{pid}");
		resp.then().log().all();
		String pid=resp.jsonPath().get("projectId");
		System.out.println(pid);
		
	}

}
