package CRUDreqreswithBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Getallprojects 
{
	@Test
	public void getlistuser()
	{
		RestAssured.when().get("https://reqres.in/api/users?page=2")
		.then().statusCode(200).contentType(ContentType.JSON).log().all();
	}

}
