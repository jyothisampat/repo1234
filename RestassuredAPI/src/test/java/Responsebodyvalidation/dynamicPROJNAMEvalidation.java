package Responsebodyvalidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import java.util.List;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class dynamicPROJNAMEvalidation 
{
	@Test
	public void dynamivresp()
	{
		String expected="hbhubv490";
		baseURI = "http://rmgtestingserver";
		 port = 8084;
	
		  Response resp = when().get("/projects");
		  
		  boolean flag= false;
		  
		  List<String> pids = resp.jsonPath().get("projectName");
		  for(String pid :pids)
		  {
			  if(pid.equalsIgnoreCase(expected))
			  {
				  flag=true;
				  break;
			  }
		  }
		 Assert.assertTrue(flag);
		 System.out.println("project name is verified");
		 resp.then().assertThat().log().all();
	}


}
