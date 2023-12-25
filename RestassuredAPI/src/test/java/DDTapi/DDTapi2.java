package DDTapi;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoClass.Pojo1;

public class DDTapi2 
{
	@DataProvider
	public Object[][] ddtapi()
	{
		Object[][] obj = new Object[2][4];
		obj[0][0]="jyo";
		obj[0][1]="Bank1";
		obj[0][2]="created";
		obj[0][3]="5";
		
		obj[1][0]="jyo1";
		obj[1][1]="Bank2";
		obj[1][2]="created1";
		obj[1][3]="2";
		
		
		return obj;
		
	}
	@Test(dataProvider="ddtapi")
	public void dataapi(String createdBy,String projectName,String status,String teamSize)
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		Pojo1 pj = new Pojo1(createdBy, projectName, status, teamSize);
		given().body(pj).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().log().all();
	}
	

}
