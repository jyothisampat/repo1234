package Browserstack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Seleniumbrowsstack 
{
	public static final String Username="jyothi_M1qgj5";
	public static final String Accesskey="e3Hax9dtswMS6fq196jq";
	public static final String Url="https://"+Username+":"+Accesskey+"@hub-cloud.browerstack.com/wd/hub";
	
	@Test
	public void Seleniumbrowsstack() throws Throwable 
	{
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("os", "Windows");
		dc.setCapability("os_version", "11");
		dc.setCapability("browser", "chrome");
		dc.setCapability("browser_version", "114");
		dc.setCapability("name", "test-name-pass");
		
		WebDriver driver= new RemoteWebDriver(new URL(Url) ,dc);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("appium"+Keys.ENTER);
		System.out.println(driver.getTitle());
	}

}
