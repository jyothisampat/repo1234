package NormalTestScript;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GettheprojectinAPI 
{
	@Test
	public void getproj()
	{
		RestAssured.when().get("http://rmgtestingserver:8084/projects/TY_PROJ_12345")
		.then().statusCode(200).contentType(ContentType.JSON).log().all();
	}

}
