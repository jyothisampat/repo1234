package CRUDpetstorewithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class Createuser
{
	@Test
	public void crtuser()
	{
		JSONObject jobj = new JSONObject();
		jobj.put("id", 4);
		jobj.put("username", "abcde@123");
		jobj.put("firstName", "abcde");
		jobj.put("lastName", "xyz1");
		jobj.put("email", "xyz@1234");
		jobj.put("password", "12345");
		jobj.put("phone", "123456789");
		jobj.put("userStatus", 4);
		
	given().body(jobj).contentType(ContentType.JSON)
		.when().post("https://petstore.swagger.io/v2/user")
		.then().contentType(ContentType.JSON).log().all();
	}

}
