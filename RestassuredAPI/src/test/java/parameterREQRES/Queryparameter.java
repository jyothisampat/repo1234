package parameterREQRES;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Queryparameter 
{
	@Test
	public void postmethod()
	{
		JSONObject jobj = new JSONObject();
		   jobj.put("name","jyothi");
		    jobj.put("job", "sdet");
		    RestAssured.given()
		    .body(jobj).contentType(ContentType.JSON)
		    .when().post("https://reqres.in/api/users")
		    .then().statusCode(201).contentType(ContentType.JSON).time(Matchers.lessThan(2000L), TimeUnit.MILLISECONDS);
		
	}

}
