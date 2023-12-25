package CRUDwithBDD;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Deleteproject 
{
	public void proj()
	{
		RestAssured.when().delete("http://rmgtestingserver:8084/projects/TY_PROJ_7949")
		.then().statusCode(204).contentType(ContentType.JSON).log().all();
	}

}
