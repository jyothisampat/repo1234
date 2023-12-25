package Schema;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.*;

public class Schemavalidation1 
{
	@Test
	public void scheme()
	{
		
		File fil = new File("./resources/schemadata.json");
		when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200).body(JsonSchemaValidator
				.matchesJsonSchema(fil));
		
	}

}
