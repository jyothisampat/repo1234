package RestPractice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CRUDwithoutBDDput
{
	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification req = RestAssured.given();
		
		JSONObject jobj = new JSONObject();
		jobj.put("name", "jyothiMB");
		jobj.put("job", "sdet");
		req.contentType(ContentType.JSON);
		req.body(jobj);
		
		Response RES = req.request(Method.PUT,"/api/users/2");
		
		System.out.println(RES.getContentType());
		System.out.println(RES.asString());
		System.out.println(RES.prettyPeek());
		
	}

}
