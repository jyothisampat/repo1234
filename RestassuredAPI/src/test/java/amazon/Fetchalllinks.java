package amazon;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fetchalllinks 
{
	@Test
	public void fecthalllinks() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		FileInputStream fis = new FileInputStream("./Amazonlinks.xlt");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int lastRowNum = sh.getLastRowNum();
		int size = links.size();
		for (int i = 0; i <size; i++)
		{
			Row r = sh.createRow(i);
			Cell c = r.createCell(0);
			c.setCellValue(links.get(i).getAttribute("href"));
			
		}
		FileOutputStream fos = new FileOutputStream("./Amazonlinks.xlt");
		wb.write(fos);
		wb.close();
		
		
		//print all limks in excel
		for (int i = 0; i < lastRowNum; i++) 
		{
			Row r = sh.getRow(i);
			String s = r.getCell(i).getStringCellValue();
			System.out.println(s);
			
		}
		
		
	}

}
