package Requestchaining;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClass.Pojo1;

public class Requestchaining3 
{
	@Test
	public void reqchain()
	{
		baseURI="http://rmgtestingserver";
		port =8084;
		Pojo1 pojo = new Pojo1("jyoo123","bank123145123","created1","7");
		
		//post a request
		Response resp= given().body(pojo).contentType(ContentType.JSON).when().post("/addProject");
		
		String projid = resp.jsonPath().get("projectId");
		
		resp.then().log().all();
		
		//get a user
		Response resp1 =given().pathParam("pid", projid).when().get("/projects/{pid}");
		String pd1 = resp1.jsonPath().get("projectId");
		resp1.then().assertThat().statusCode(200).log().all();
		System.out.println(pd1);
		System.out.println("*****************************");
		
		//update the user
		Pojo1 pj1 = new Pojo1("jyoothiiiiii","bank123451234568","updated2","9");
		Response resp2 = RestAssured.given().pathParam("pd2", pd1).body(pj1).contentType(ContentType.JSON).when().put("/projects/{pd2}");
		resp2.then().log().all();
		String pid3 = resp2.jsonPath().get("projectId");
		System.out.println(pid3);
		
		
		
		
		
	}

}
