package Requestchaining;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Requestchaining2 
{
	@Test
	public void request2()
	{
		
		baseURI="https://reqres.in";
		Response resp = when().get("/api/users?page=2");
		Integer ids = resp.jsonPath().get("data[2].id");
		resp.then().assertThat().statusCode(200).log().all();
		
		given().pathParam("id1", ids)
		.when().get("/api/users/{id1}").then().assertThat().statusCode(200).log().all();
		
		
		
	}

}
