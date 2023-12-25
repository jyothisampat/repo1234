package parameterwithBDD;

import static io.restassured.RestAssured.baseURI;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Queryparameter 
{
	@Test
		public void qurpara()
		{
		 baseURI = "https://reqres.in/";
		 RestAssured.given().queryParam("page", 2).contentType(ContentType.JSON)
		 .when().get("/api/users").then().assertThat().statusCode(200).contentType(ContentType.JSON)
		 .time(Matchers.lessThan(2000l), TimeUnit.MILLISECONDS);
		}

}
