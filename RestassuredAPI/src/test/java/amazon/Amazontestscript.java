package amazon;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazontestscript 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		List<WebElement> eles = driver.findElements(By.xpath("//div[@class='sg-row']/decendent::span[@class='a-price-whole']"));
		FileInputStream fis = new FileInputStream("/RestassuredAPI/Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		int size =eles.size();
		for(int i=0; i<size; i++)
		{
			Row r = sh.createRow(i);
			Cell c = r.createCell(0);
			c.setCellValue(eles.get(i).getText());
		}
		FileOutputStream fos = new FileOutputStream("/RestassuredAPI/Book1.xlsx");
		book.write(fos);
		
		
		
	}

}
