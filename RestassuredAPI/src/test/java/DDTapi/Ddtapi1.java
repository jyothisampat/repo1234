package DDTapi;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import pojoClass.Pojo1;

public class Ddtapi1 
{
	@DataProvider
	public Object[][] data()
	{
		Object[][] data = new Object[3][4];
		
		data[0][0] = "jyo1";
		data[0][1] = "bank1";
		data[0][2] = "cmpleted1";
		data[0][3] = "1";
		
		data[1][0] = "jyo2";
		data[1][1] = "bank2";
		data[1][2] = "Created2";
		data[1][3] = "2";
		
		data[2][0] = "jyo3";
		data[2][1] = "bank3";
		
		data[2][2] = "On Going";
		data[2][3] = "3";
		
		
		return data;
	}
	@Test(dataProvider="data")
	public void ddtapi(String createdBy,String projectName,String status,String teamSize)
	{

		baseURI = "http://rmgtestingserver";
		port = 8084;
		Pojo1 pj = new Pojo1(createdBy, projectName, status, teamSize);
		given().body(pj).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().log().all();
		
	}

}
