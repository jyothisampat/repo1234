package CRUDwithoutBDD;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class updatetheproject 
{
	@Test
	public void update()
	{
		JSONObject jobj = new JSONObject();
		jobj.put("cratedBy","ABCD");
		jobj.put("ProjectName", "onlinebanking123");  //jobj.put("ProjectName", "onlinebanking1"+jlib.randomNum());
		jobj.put("status","created12");
		jobj.put("teamsize",5);
		
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		
		//perform action
		Response response = req.put("http://rmgtestingserver:8084/projects/TY_PROJ_7342");
		
		//validate the response
		
		System.out.println(response.getContentType());
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		System.out.println(response.prettyPrint());
		System.out.println(response.prettyPeek());
		
	}

}
