package CRUDwithBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class getallproject 
{
	@Test
	public void getallproj()
	{
	RestAssured.when().get("http://rmgtestingserver:8084/projects")
		.then().statusCode(200).contentType(ContentType.JSON).log().all();
	}

}
