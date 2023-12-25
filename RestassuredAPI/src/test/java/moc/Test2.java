package moc;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashSet;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\windows\\eclipse-workspace\\Mainclass\\RCCE26 msnj\\RestassuredAPI\\moc.xlsx.xlt");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		//Row row = sh.getRow(0);
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		int lastRowNum = sh.getLastRowNum();
		for(int i=0;i<lastRowNum;i++)
		{
			String cell = sh.getRow(0).getCell(i).getStringCellValue();
			set.add(cell);
			
		}
		System.out.println(set);
		
	}
	

}
