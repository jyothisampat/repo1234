package CRUDwithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class Getallproject
{
	@Test
	public void allproj()
	{
		Response response = RestAssured.get("http://rmgtestingserver:8084/projects");
		
		
		//provide validation
		response.then().log().all();
		int actstatuscode = response.getStatusCode();
		Assert.assertEquals(200, actstatuscode);
	}

}
