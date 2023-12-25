package NormalTestScript;

import java.sql.SQLException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtility.Basecalss;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClass.Pojo1;

public class CreateAPIgetGUIgetDB extends Basecalss

{
	@Test
	public void Scenario1() throws InterruptedException, SQLException
	{
		//create a project using API
		
		Random ran = new Random();
		int r = ran.nextInt();
		Pojo1 pj = new Pojo1("jyothi", "bank1"+r, "crtd1", "5");
		
		 Response resp = given().body(pj).contentType(ContentType.JSON)

		.when().post("http://rmgtestingserver:8084/addProject");
		
		resp.then().assertThat().statusCode(201).log().all();
		
		String pid = resp.jsonPath().get("projectId");
		resp.then().log().all();
		System.out.println(pid);
		
		
		
		//GET the project using GUI
		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver:8084/");
		Thread.sleep(2000);
	
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rmgyantra");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Projects")).click();
		Thread.sleep(2000);
		
		
			WebElement expdata = driver.findElement(By.xpath("//td[1]"));
			String text2 = expdata.getText();
			System.out.println(text2);
		
			if(pid.equalsIgnoreCase(text2))
			{
				System.out.println("project is present in the GUI");
			}
		
		//GET THE PROJECT IN DATABASE
			
			String query ="select * from project";
			String rv = dlib.readDatafromDBandValidate(query, 1, text2);
			System.out.println(rv);
			Assert.assertEquals(rv, text2);
			
			//given().body(pj).contentType(ContentType.JSON)
			//.when().put()
			
	}
	

}
