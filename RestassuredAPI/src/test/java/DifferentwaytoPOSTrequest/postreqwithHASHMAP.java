package DifferentwaytoPOSTrequest;

import java.util.HashMap;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class postreqwithHASHMAP 
{
	@Test
	public void postreqhash()
	{
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("createdBy", "jyothi");
		map.put("projectName", "bank");
		map.put("status", "on going");
		map.put("teamSize", "1");
		
	given().body(map).contentType(ContentType.JSON).when().post("http://rmgtestingserver:8084/addProject")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
		
	}

}
