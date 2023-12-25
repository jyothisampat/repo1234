package moc;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertTrue;

import java.util.List;

public class Fetchallnameandverifyname
{
	@Test
	public void fetchname()
	{
		
		String Expected ="Michael";
		Response resp = when().get("https://reqres.in/api/users?page=2");
		//System.out.println(actdata);
		//if(Expected.equalsIgnoreCase(actdata))
		
		
		List<String> actdatas = resp.jsonPath().get("data.first_name");
		boolean flag= false;
		for(String actdata :actdatas)
		{
			if(actdata.equalsIgnoreCase(Expected))
			{
				flag=true;
				System.out.println("verified");
			}
		}
		
		Assert.assertTrue(flag);
		
		resp.then().log().all();		
		
		
		
		
	}

}
