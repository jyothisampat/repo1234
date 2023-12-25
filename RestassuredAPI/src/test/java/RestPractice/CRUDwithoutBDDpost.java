package RestPractice;

import org.json.simple.JSONObject;

import com.github.dockerjava.api.command.RestartContainerCmd;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CRUDwithoutBDDpost {

	public static void main(String[] args)
	{
//		RestAssured.baseURI="https://reqres.in";
//		RequestSpecification req = RestAssured.given();
//		JSONObject jobj= new JSONObject();
//		jobj.put("name", "morpheus");
//		jobj.put("job", "leader");
//		req.contentType(ContentType.JSON);
//		req.body(jobj);
//		Response res = req.request(Method.POST,"/api/users");
//		System.out.println(res.getContentType());
//		System.out.println(res.prettyPrint());
//		System.out.println(res.prettyPeek());
//		System.out.println(res.asString());
		
		
		
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification req = RestAssured.given();
		JSONObject jobj = new JSONObject();
		jobj.put("name", "jyothi");
		jobj.put("job", "qa");
		req.contentType(ContentType.JSON);
		req.body(jobj);
		Response res = req.request(Method.POST,"/api/users");
		System.out.println(res.getContentType());
		System.out.println(res.prettyPrint());
		System.out.println(res.prettyPeek());
		System.out.println(res.asString());
		
	}

}
