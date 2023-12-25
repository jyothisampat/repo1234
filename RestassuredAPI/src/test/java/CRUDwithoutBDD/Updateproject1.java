package CRUDwithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Updateproject1 
{
	@Test
	public void updateproj()
	{
		RestAssured.baseURI ="https://reqres.in";
		RequestSpecification req = RestAssured.given();
		JSONObject jobj = new JSONObject();
		jobj.put("name","jyothi");
		jobj.put("job","sdet");
		req.contentType(ContentType.JSON);
		req.body(jobj.toJSONString());
		 Response a=req.request(Method.POST,"/api/user");
		System.out.println(a.asString());
		System.out.println(a.statusCode());
		System.out.println(a.statusLine());
	}

}
