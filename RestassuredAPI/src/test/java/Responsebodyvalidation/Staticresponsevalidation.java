package Responsebodyvalidation;



import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;



public class Staticresponsevalidation 
{
	@Test
	public void staticresp()
	{
		String expected="TY_PROJ_6338";
		baseURI = "http://rmgtestingserver";
		 port = 8084;
	  
	 Response resp = when().get("/projects");
  String actualproj = resp.jsonPath().get("[1].projectId");
	System.out.println(actualproj);
	Assert.assertEquals(expected , actualproj);
	System.out.println("data is verified");
	resp.then().assertThat().log().all();
	
	}

}
