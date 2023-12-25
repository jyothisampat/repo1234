package CRUDreqreswithBDD;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Getsingleprojects 
{
	public void singleuser()
	{
	   RestAssured.when().get("https://reqres.in/api/users/2")
			.then().statusCode(200).contentType(ContentType.JSON).log().all();
		
	}

}
