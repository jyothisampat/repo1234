package Cookies;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.Map;

import io.restassured.response.Response;

public class Passcookies 
{
	@Test
	public void psck()
	{
		
		Response resp=given().when().get("http://www.google.com/");
		
		// to get single cookie
		String CKV = resp.getCookie("AEC");
		System.out.println(CKV);
		
		// to capture all cookies information
		Map<String, String> allcks = resp.getCookies();
		
		// to capture  only key value
		System.out.println(allcks.keySet());
		
		for(String ck :allcks.keySet())
		{
			String ckv = resp.getCookie(ck);
			System.out.println(ck+"         "+ckv);
		}
		
		
		
	}

}
