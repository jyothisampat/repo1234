package CRUDpetstorewithBDD;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class logoutincurrentsession 
{
	public void logout()
	{
		RestAssured.when().get("https://petstore.swagger.io/v2/user/logout")
		.then().assertThat().contentType(ContentType.JSON).log().all();
	}

}
