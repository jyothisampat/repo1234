package Headervalidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import junit.framework.Assert;

public class Headervalidationusingpost 
{
	@Test
	public void hdvalidate()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		Random ran = new Random();
		int r = ran.nextInt();
		
		 JSONObject jobj = new JSONObject();
		 jobj.put("createdBy", "jyothi");
		 jobj.put("projectName", "tyss125"+r);
		 jobj.put("status", "crtd");
		 jobj.put("teamsize", "5");
		 		
		Response resp = given().body(jobj).contentType(ContentType.JSON)
		.when().post("/addProject");
		resp.then().assertThat().log().all();
		
		
		String rs = resp.jsonPath().get("projectId");
		System.out.println(rs);
		
		Response resp1 = given().pathParam("rs1", rs).when().get("/projects/{rs1}");
		resp1.then().assertThat().log().all();
		
		String expected_statusLine = "HTTP/1.1 200 ";
		String expected_vary="Access-Control-Request-Headers";
		String expected_ContentType="application/json";
		String expected_Pragma="no-cache";
		String expected_Connection="keep-alive";
		
		Headers headers = resp1.getHeaders();
		System.out.println(headers);
		
		String statusLine = resp1.statusLine();
		System.out.println(statusLine);
		Assert.assertEquals(statusLine, expected_statusLine);
		
		String vary = resp1.getHeader("Vary");
		System.out.println(vary);
		Assert.assertEquals(vary, expected_vary);
		
		String pragma = resp1.getHeader("Pragma");
		System.out.println(pragma);
		Assert.assertEquals(pragma,expected_Pragma );
		
		String contenttype = resp1.getHeader("Content-Type");
		System.out.println(contenttype);
		Assert.assertEquals(contenttype, expected_ContentType);
		
		String connection = resp1.getHeader("Connection");
		System.out.println(connection);
		Assert.assertEquals(connection, expected_Connection);
		
		
	}

}
