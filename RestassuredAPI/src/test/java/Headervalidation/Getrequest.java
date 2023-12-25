package Headervalidation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Getrequest
{
	@Test
	public void gtreq()
	{

		baseURI="http://rmgtestingserver";
		port=8084;
		when().get("/projects/TY_PROJ_8476").then().assertThat().log().all();
	}

}
