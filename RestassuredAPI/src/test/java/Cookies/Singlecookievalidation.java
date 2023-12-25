package Cookies;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
public class Singlecookievalidation 
{
	@Test
	public void singlecooki()
	{
		//cookies validation
		when().get("http://www.google.com").then().cookie("AEC").cookie("NID").log().all();
	
	}
	
		//validate cookie
		@Test
		public void validatecookie()
		{
			given().when().get("http://www.google.com").then().cookie("1P_JR").log().all();
		}
		
		
		
		
		
		
		
		
		
	

}
