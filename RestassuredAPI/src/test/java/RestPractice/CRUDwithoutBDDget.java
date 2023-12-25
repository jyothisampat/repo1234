package RestPractice;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CRUDwithoutBDDget 
{
	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.GET,"/api/users?page=2");
		System.out.println(res.getContentType());
		System.out.println(res.statusCode());
		System.out.println(res.prettyPeek());
		
	}

}
