package parameterwithBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;



import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Formparameter 
{
	public void formpara()
	{
		 baseURI = "http://rmgtestingserver";
		 port = 8084;
		JSONObject jobj = new 	JSONObject();
		jobj.put("createdBy","avbsgg");
		jobj.put("projectName", "bank23");
		jobj.put("status","crtd");
		jobj.put("teamSize",284);
		RestAssured.given().formParam("createdBy", "jyothi").body(jobj).contentType(ContentType.JSON)
		.when().post("https://petstore.swagger.io/v2/user")
		.then().contentType(ContentType.JSON).time(Matchers.lessThan(2000L), TimeUnit.MILLISECONDS);
	}

}
