package Interviewquestions;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojoClass.Pojo1;

public class RequestspecandResponsespecbuilder
{
	@Test
	public void reqresspecbuild()
	{
		Pojo1 pj = new Pojo1("jyothi", "Onlinebank", "created", "5");
		
		
		RequestSpecification reqspec = new RequestSpecBuilder()
		.setBaseUri("http://rmgtestingserver:8084")
		.setContentType(ContentType.JSON).build();
		
		ResponseSpecification resspec = new ResponseSpecBuilder()
				.expectContentType(ContentType.JSON)
				.expectStatusCode(201).build();
	
		given().spec(reqspec).body(pj)
		.when().post("/addProject")
		.then().spec(resspec).log().all();
		
		
		
		
	}

}
