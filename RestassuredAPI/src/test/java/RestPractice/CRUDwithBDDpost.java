package RestPractice;

import org.json.simple.JSONObject;

import static io.restassured.RestAssured.*;

public class CRUDwithBDDpost 
{
	public static void main(String[] args) 
	{
		JSONObject jobj = new JSONObject();
		jobj.put("name", "Asha1");
		jobj.put("job", "se1");
		
		//post a requrest
//		given().body(jobj).contentType(ContentType.JSON)
//		.when().post("https://reqres.in/api/users")
//		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
		
//		//get method 
//		given().when().get("https://reqres.in/api/users?page=2")
//		.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
		
		
//		//get method for single user
//				given().when().get("https://reqres.in/api/users/8")
//				.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
//				
				
//		//put method for update
//		given().body(jobj).contentType(ContentType.JSON)
//		.when().put("https://reqres.in/api/users/2")
//		.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
		
		
		//delete the data
		given().when().delete("https://reqres.in/api/users/2")
		.then().assertThat().statusCode(204).log().all();
				
		
	}

}
