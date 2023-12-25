package CRUDwithBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Getsingleproject 
{
	@Test
	public void getsingleproj()
	{
		RestAssured.when().get("http://rmgtestingserver:8084/projects/TY_PROJ_8065")
		.then().statusCode(200).contentType(ContentType.JSON).log().all();
	}

}
