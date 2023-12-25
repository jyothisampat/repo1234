package DifferentwaytoPOSTrequest;

import java.io.File;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class postreqwithJSONfileBDD
{
	@Test
	public void postwithJSONfile()
	{
		File file = new File("./RESTAPI.json");
		given().body(file).contentType(ContentType.JSON)
		
		.when().post("http://rmgtestingserver:8084/addProject")
		
		
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
	}


}
