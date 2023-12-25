package Headervalidation;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.http.Headers;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class Headervalidate 
{
	@Test
	public void hdvalidate()   //get http method
	{
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
		String expected_statusLine = "HTTP/1.1 200 ";
		String expected_vary="Access-Control-Request-Headers";
		String expected_ContentType="application/json";
		String expected_Pragma="no-cache";
		String expected_Connection="keep-alive";
		
		
		Response resp = when().get("/projects/TY_PROJ_8476");
		resp.then().log().all();		
		//ResponseBody body = resp.body();
		//System.out.println(body.asPrettyString());
		
		Headers headers = resp.getHeaders();
		System.out.println(headers);
		
		String statusLine = resp.statusLine();	
		System.out.println(statusLine);
		Assert.assertEquals(statusLine,expected_statusLine);
		
		String actual_vary = resp.getHeader("Vary");
		System.out.println(actual_vary);
		Assert.assertEquals(actual_vary, expected_vary);
		
		String ContentType = resp.getHeader("Content-Type");
		System.out.println(ContentType);
		Assert.assertEquals(ContentType, expected_ContentType);
		
		String pragma = resp.getHeader("Pragma");
		System.out.println(pragma);
		Assert.assertEquals(pragma, expected_Pragma);
		
		String cnct = resp.getHeader("Connection");
		System.out.println(cnct);
		Assert.assertEquals(cnct, expected_Connection);
		
		
		
		
		
	
	}

}

