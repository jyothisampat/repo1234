package Requestchaining;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojoClass.Pojo1;

public class Reqestchaining1 
{
	@Test
	public void reqchain()
	{
		
		Pojo1 pojo = new Pojo1("jyoo","bank12","created","6");
		baseURI="http://rmgtestingserver";
		port =8084;
		Response resp= given().body(pojo).contentType(ContentType.JSON)
				.when().post("/addProject");
		
		//capture the project id 
		String  pid = resp.jsonPath().get("projectId");
		System.out.println(pid);
		resp.then().log().all();
		//JsonPath s = resp.jsonPath();
		
		
		//create a get request and pass pid as path parameter
		given().pathParam("pd", pid).when().get("/projects/{pd}").then().assertThat().statusCode(200).log().all();
	}

}
