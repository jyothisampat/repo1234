package CRUDpetstorewithBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Deleteuser 
{
	@Test
	public void deleteusers()
	{
		RestAssured.when().delete("https://petstore.swagger.io/v2/user/abcde@123")
		.then().assertThat().statusCode(404).contentType(ContentType.JSON).log().all();

	}

}
