package APIFramework1;

import static io.restassured.RestAssured.given;


import java.sql.SQLException;

import org.testng.annotations.Test;

import GenericUtility.Basecalss;
import GenericUtility.EndpointsUtility;
import io.restassured.response.Response;

public class InsertintoDBandgetproject extends Basecalss
{
	@Test
	public void insertdata() throws SQLException
	{
		int ran = jlib.randomnumber();
	String project="Onlinebanking"+ran;
	String query="insert into project values('TY_PROJ_12345','Jyothi123','29-06-23','"+project+"','created','5')";
	String actdata = dlib.insertdataintoDB(query);
	System.out.println(actdata);
	
	/*Response resp = given().pathParam("pid", "TY_PROJ_1111").spec(reqst)
	.when().get(EndpointsUtility.getSingleProject+"{pid}");
	resp.then().log().all();*/
				
				
				
				
				
				
				
	}

}
