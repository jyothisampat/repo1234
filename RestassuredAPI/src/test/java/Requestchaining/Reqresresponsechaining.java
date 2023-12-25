package Requestchaining;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class Reqresresponsechaining

{
	@Test
	public void reqreschain()
	{
		
		//baseURI="https://reqres.in";
		Response resp= when().get("https://reqres.in/api/users?page=2");
				
				
				Integer  ids = resp.jsonPath().get("data[0].id");
				System.out.println(ids);
				resp.then().log().all();
				
		
		//create a get request and pass pid as path parameter
				given().pathParam("id1", ids).when().get("https://reqres.in/api/users/{id1}").then().assertThat().statusCode(200).log().all();
		
	}

}
