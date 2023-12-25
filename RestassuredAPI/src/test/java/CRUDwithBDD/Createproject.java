package CRUDwithBDD;

import org.json.simple.JSONObject;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;



public class Createproject 
{
	@Test
	public void createproj()
	{
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy","jyothi123");
		jobj.put("projectName", "onlinebanking1223");
		jobj.put("status","crtedd");
		jobj.put("teamSize",283);
		

		given().body(jobj).contentType(ContentType.JSON)
		.when().post("http://rmgtestingserver:8084/addProject")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
		
		
		
	}

}
