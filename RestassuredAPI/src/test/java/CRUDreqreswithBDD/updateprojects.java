package CRUDreqreswithBDD;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class updateprojects 
{
	@Test
	public void update()
	{
		JSONObject jobj = new JSONObject();
		jobj.put("name","jyothi123");
		jobj.put("job", "sdet48");
		
		

		given().body(jobj).contentType(ContentType.JSON)
		.when().put("https://reqres.in/api/users/2")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
		
	}

}
