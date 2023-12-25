package Authentication;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Digestive 
{
	@Test
	public void digestiveauth()
	{
		baseURI="http://rmgtestingserver";
		port =8084;
		RestAssured.given().auth().digest("rmgyantra", "rmgy@9999")
		.when().get("/login")
		.then().assertThat().statusCode(202).log().all();
	}

}
