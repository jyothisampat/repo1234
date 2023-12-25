package CRUDwithBDD;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Updateproject 
{
	@Test
	public void updateproj()
	{

		JSONObject jobj = new JSONObject();
		jobj.put("createdBy","jyo1234");
		jobj.put("projectName", "onlinebanking12234");
		jobj.put("status","crtedddd");
		jobj.put("teamSize",1);
		

		given().body(jobj).contentType(ContentType.JSON)
		.when().put("http://rmgtestingserver:8084/projects/TY_PROJ_8065")
		.then().statusCode(200).contentType(ContentType.JSON).log().all();
		
	}

}
