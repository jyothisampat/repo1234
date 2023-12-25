package Responsebodyvalidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import java.util.List;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSender;

import static io.restassured.RestAssured.*;

public class Dynamicresponsevalidation
{
	@Test
	public void dynamivresp()
	{
		String expected="TY_PROJ_6338";
		baseURI = "http://rmgtestingserver";
		 port = 8084;
	
		  Response resp = when().get("/projects");
		  
		  boolean flag= false;
		  
		  List<String> pids = resp.jsonPath().get("projectId");
		  for(String pid :pids)
		  {
			  if(pid.equalsIgnoreCase(expected))
			  {
				  flag=true;
			  }
		  }
		 Assert.assertTrue(flag);
		 System.out.println("project id is verified");
		 resp.then().log().all();
	}

}
