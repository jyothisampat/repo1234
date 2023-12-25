package parameterwithBDD;

import java.util.concurrent.TimeUnit;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class Pathparameter 
{
	@Test
	public void pathpara()
	{
		 baseURI = "http://rmgtestingserver";
		 port = 8084;
		JSONObject jobj = new 	JSONObject();
		jobj.put("createdBy","avbsgg");
		jobj.put("projectName", "bank23");
		jobj.put("status","crtd");
		jobj.put("teamSize",284);
		
	given().pathParam("pid","TY_PROJ_8470").body(jobj).contentType(ContentType.JSON)
		.when().put("/projects/{pid}").then().assertThat().statusCode(200).contentType(ContentType.JSON)
		.time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS).log().all();
	}

}
