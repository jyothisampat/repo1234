package CRUDwithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class Getsingleproject 
{
	@Test
	public void singleproj()
	{
		//step1 : create pre requisites
		//step2: perform the action
		Response response = RestAssured.get("http://rmgtestingserver:8084/projects/TY_PROJ_7342");
		
		//provide validation
		response.then().log().all();
		int actstatuscode = response.getStatusCode();
		Assert.assertEquals(200, actstatuscode);
		
	}

}
