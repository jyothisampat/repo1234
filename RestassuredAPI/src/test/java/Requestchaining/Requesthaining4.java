package Requestchaining;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;



public class Requesthaining4 
{
	@Test
	public void requestchn()
	{
		
		//baseUTRI ="https://api.github.com";
		JSONObject jobj= new JSONObject();
		jobj.put("name","jyothi");
		
		Response resp1 = given().body(jobj).contentType(ContentType.JSON).when().post("https://api.github.com/user/repos");
		String reponame = resp1.jsonPath().get("name");
		System.out.println(reponame);
		resp1.then().statusCode(201).log().all();
		
	}

}
