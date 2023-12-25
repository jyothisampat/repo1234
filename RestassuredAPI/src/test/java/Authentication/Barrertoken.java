package Authentication;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Barrertoken 
{
	@Test
	public void barrer()//post http method
	{
		baseURI="https://api.github.com";
		JSONObject jobj =new JSONObject();
		jobj.put("name", "jyothi");
		jobj.put("job", "SDET48");
		
		RestAssured.given().auth().oauth2("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").body(jobj).contentType(ContentType.JSON)
		.when().post("/user/repos").then().statusCode(201).contentType(ContentType.JSON).log().all();
	}

}
