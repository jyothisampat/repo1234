package DifferentwaytoPOSTrequest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoClass.Pojo1;

public class postreqwithPOJO 
{
	@Test
	public void postpojo()
	{
		Pojo1 pojo = new Pojo1("jyo","bank1","created","5");
		given().body(pojo).contentType(ContentType.JSON)
		.when().post("http://rmgtestingserver:8084/addProject")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
	}

}
