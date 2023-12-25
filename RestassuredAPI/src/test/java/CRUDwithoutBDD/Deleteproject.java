package CRUDwithoutBDD;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Deleteproject 
{
	@Test
	public void delete()
	{
		Response response = RestAssured.delete("http://rmgtestingserver:8084/projects/TY_PROJ_7787");
		
		response.then().log().all();
		int statusCode = response.getStatusCode();
		System.out.println(response.getContentType());
		
		Assert.assertEquals(204, statusCode);
		
	}

}
