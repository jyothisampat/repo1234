package Responsebodyvalidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class staticPROJNAMEvalidation 
{
	@Test
	public void staticresp()
	{
		String expected="hbhubv490";
		baseURI = "http://rmgtestingserver";
		 port = 8084;
	  
	 Response resp = when().get("/projects");
  String actualproj = resp.jsonPath().get("[0].projectName");
	System.out.println(actualproj);
	Assert.assertEquals(expected , actualproj);
	System.out.println("data is verified");
	resp.then().assertThat().log().all();
	
	}

}
