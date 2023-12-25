package APIFramework1;

import org.testng.annotations.Test;

import GenericUtility.Basecalss;
import GenericUtility.EndpointsUtility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

import pojoClass.Pojo1;

public class VerifyTheProjectInFrontEnd extends Basecalss
{
	@Test
	public void vryprojfront() throws SQLException
	{
		//craete pre requisites
				Pojo1 pj = new Pojo1("jyothi", "tyss1", "created", "5");
				
				//send the request
				Response resp =given().spec(reqst).body(pj).contentType(ContentType.JSON)
				.when().post(EndpointsUtility.createProject);  //post(classname.methodname);
				
				//capture the project id
				String expdata = rlib.getJsonData(resp, "projectId");
				System.out.println(expdata);
				
				Response resp1 = given().pathParam("pid",expdata).when().get(EndpointsUtility.getSingleProject);
				String expdata1 = rlib.getJsonData(resp, "projectId/{pid}");
				System.out.println(expdata1);
				System.out.println(resp1);
				
				resp.then().log().all();
				
				
				
				
				
				
				
		/*		//validate the Id in the database
				String query = "select * from project;";
				String actData = dlib.readDatafromDBandValidate(query, 1, expdata);
				
				Assert.assertEquals(expdata, actData);
				System.out.println("testcase is pass");
				
				resp.then().log().all();                  */
	}

}
