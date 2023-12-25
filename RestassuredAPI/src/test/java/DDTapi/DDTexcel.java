package DDTapi;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.io.FileInputStream;
import java.util.Random;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoClass.Pojo1;

public class DDTexcel 
{
	@DataProvider
	public Object[][] excel() throws Throwable
	{
		FileInputStream fis = new FileInputStream("./resources/apiddt123.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet("Sheet1");
	int lastrow = sh.getLastRowNum()+1;
	int lastcell = sh.getRow(0).getLastCellNum();
	Object[][] obj=new Object[lastrow][lastcell];
	
	for(int i=0;i<lastrow;i++)
	{
		for(int j=0;j<lastcell;j++)
		{
		obj[i][j]= sh.getRow(i).getCell(j).getStringCellValue();
		 
			
		}
 }
	return obj;
 
 
}
	@Test(dataProvider="excel")
	public void dataapi(String createdBy,String projectName,String status,String teamSize)
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		Random ran = new Random();
		int r = ran.nextInt();
		Pojo1 pj = new Pojo1(createdBy, projectName+r, status, teamSize);
		given().body(pj).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().log().all();
		
		
	}
	
	
	

}
