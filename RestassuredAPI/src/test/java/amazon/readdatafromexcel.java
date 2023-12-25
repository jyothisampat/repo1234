package amazon;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class readdatafromexcel 
{
	@Test
	public void readdata() throws InterruptedException, EncryptedDocumentException, IOException
	{
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		FileInputStream fis = new FileInputStream("./Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//wb.getSheet("Sg)
		
	}

}
