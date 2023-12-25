package CRUDwithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class createproject 
{
	@Test
	public void createproj()
	{
		//create pre requisites -request body
		JSONObject jobj = new JSONObject();
		jobj.put("cratedBy","jyothi");
		jobj.put("ProjectName", "onlinebanking1");
		jobj.put("status","created");
		jobj.put("teamsize",5);
		
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		
		//perform action
		Response response = req.post("http://rmgtestingserver:8084/addProject");
		
		//validate the response
		
		//System.out.println(response.getContentType());
		//System.out.println(response.asString());
		//System.out.println(response.prettyPrint());
		System.out.println(response.prettyPeek());
		
		
		
	}

}
