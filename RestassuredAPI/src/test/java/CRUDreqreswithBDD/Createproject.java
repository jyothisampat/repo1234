package CRUDreqreswithBDD;



import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.Random;

import io.restassured.http.ContentType;

public class Createproject
{
	@Test
	public void createproj()
	{
		Random ran = new Random();
		int r = ran.nextInt(1000);
		JSONObject jobj = new JSONObject();
		jobj.put("name","jyothi+r");
		jobj.put("job", "sdet");
		
		

		given().body(jobj).contentType(ContentType.JSON)
		.when().post("https://reqres.in/api/users")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
		
	}

}
