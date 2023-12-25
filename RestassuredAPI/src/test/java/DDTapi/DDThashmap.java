package DDTapi;

import java.io.FileInputStream;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DDThashmap
{
	/*public Object[][] ddthash()
	{
		Object[][] obj=new Object[][];
		
		map.put("createdBy", "jyothi");
		map.put("projectName", "TYSS");
		map.put("status", "created");
		map.put("teamSize", "5");
		return obj;*/
		
		
		
		
		/*@DataProvider
		public Object[][] excel() throws Throwable
		{
			FileInputStream fis = new FileInputStream("./resources/apiddt123.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		int lastrow = sh.getLastRowNum()+1;
		Object[][] obj=new Object[lastrow][lastcell];
		HashMap<String, String> map = new HashMap<String, String>();
		for(int i=0;i<lastrow;i++)
		{
		String key = sh.getRow(i).getCell(1).getStringCellValue();
		String value = sh.getRow(i).getCell(i).getStringCellValue();
		}
		return obj;
	 
	 
	}*/
		
	}


