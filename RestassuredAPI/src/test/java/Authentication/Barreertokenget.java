package Authentication;

import static io.restassured.RestAssured.baseURI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Barreertokenget 
{
	@Test
	public void bareerget()
	{
		baseURI="https://api.github.com";
		
		
		RestAssured.given().auth().oauth2("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")
		.when().get("/repos/jyothimb2396/jyothi").then().statusCode(200).contentType(ContentType.JSON).log().all();
		
		
		
	}

}
