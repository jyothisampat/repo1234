package CRUDwithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Getallprojects1 {
	@Test
	public void createproj1()
	{
	RestAssured.baseURI ="https://reqres.in";
	RequestSpecification req = RestAssured.given();
	Response res = req.request(Method.GET,"/api/user/2");
	String a = res.asString();
	System.out.println(a);
	}
}
