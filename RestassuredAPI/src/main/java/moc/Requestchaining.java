package moc;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Requestchaining 
{
	@Test
	public void reqchai()
	{
		
		JSONObject jo = new JSONObject();
		jo.put("name", "jyothi");
		jo.put("job", "Sdet");
		Response resp =given().body(jo).contentType(ContentType.JSON)
		.when().post("https://reqres.in/api/users");
		resp.then().assertThat().contentType(ContentType.JSON).statusCode(201).log().all();
		
		String ids = resp.jsonPath().get("id");
		
	given().pathParam("id1",ids).when().get("https://reqres.in/api/users/2/{id1}").then().log().all();
		
		
	}

}
