package Udemypractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://rahulshettyacademy.com/client");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jyothi.rpem20@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Bgk2bagalkot@*");
		Thread.sleep(1000);
		driver.findElement(By.id("login")).click();
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='card-body']"));
		String actual= "zara coat 3";
		System.out.println("****************");
		for (WebElement prod : products)
		{
			System.out.println(prod);
			String text = prod.getText();
			if (text.equalsIgnoreCase(actual)) 
			{
				System.out.println(text);
				
			}
			
		}
		
		
		
//		for (int i = 0; i < products.size(); i++) 
//		{
//			String prod = products.get(i).getText();
//			System.out.println(prod);
//			System.out.println("+++++++++++++");
//			if (actual.equalsIgnoreCase("zara coat 3")) 
//			{
//				System.out.println(prod);
//				break;
//				
//			}
//		}
		
		
		
		
		//WebElement prod = products.stream().filter(product->  product.findElement(By.xpath()).getText().equals("zara coat 3")).findFirst().orElse(null);
			
		
		
		
		////div[@class='card']/descendant::b[.='zara coat 3']	
				
				
				//product.findElement(By.xpath("//b")("zara coat 3")));
	
	}

}
