package APIFramework1;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

import GenericUtility.Basecalss;
import GenericUtility.EndpointsUtility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;
import pojoClass.Pojo1;

public class CreateProject extends Basecalss//create project and verify the project is present in database or not
{
	public void crtproj() throws SQLException
	{
		//craete pre requisites
		Pojo1 pj = new Pojo1("jyothi123", "tyss123", "created123", "123");
		
		//send the request
		Response resp =given().spec(reqst).body(pj).contentType(ContentType.JSON)
		.when().post(EndpointsUtility.createProject);  //post(classname.methodname);
		
		//capture the project id
		String expdata = rlib.getJsonData(resp, "projectId");
		System.out.println(expdata);
		
		//validate the Id in the database
		String query = "select * from project;";
		String actData = dlib.readDatafromDBandValidate(query, 1, expdata);
		
		Assert.assertEquals(expdata, actData);
		System.out.println("testcase is pass");
		
		resp.then().log().all();
		
		
		
	}

}
