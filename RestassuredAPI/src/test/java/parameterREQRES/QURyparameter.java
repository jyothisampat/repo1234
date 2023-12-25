package parameterREQRES;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class QURyparameter 
{
	@Test
	public void qrypara()
	{
		RestAssured.given().queryParam("page", 2).contentType(ContentType.JSON)
		.when().get("https://reqres.in/api/users").then().assertThat().statusCode(200).contentType(ContentType.JSON)
		.time(Matchers.lessThan(5000L), TimeUnit.MILLISECONDS).log().all();
	}

}
