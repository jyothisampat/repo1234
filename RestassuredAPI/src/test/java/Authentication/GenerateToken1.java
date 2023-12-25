package Authentication;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class GenerateToken1 
{
	@Test
	public void token()
	{
		
		Response resp= given()
		.formParam("client_id","Onlinebanking")
		.formParam("client_secret","ca2b980f42120f45c603ebb5e713ce5d")
		.formParam("grant_type","client_credentials")
		.formParam("redirected_uri","http://rmgtestingserver/domain/Online_Banking_System")
		.formParam("code","authorization_code") 
		
		.when().post("http://coop.apps.symfonycasts.com/token");
		 resp.then().log().all();
		
		 
		 //capture the access token from the response of above request
		String token = resp.jsonPath().get("access_token");
		 System.out.println(token);
		
		 
		 
		// create another request and use the token to access APIs
		 given().auth().oauth2(token).pathParam("USER_ID", 4569)
		 .when().post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-collect")
		 
		 .then().log().all();
		 
	}
}
