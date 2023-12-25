package NormalTestScript;

import java.sql.SQLException;

import org.testng.annotations.Test;

import GenericUtility.Basecalss;

public class Createprojectinthedatabase extends Basecalss
{
	@Test
	public void crtproj() throws SQLException
	{
		int ran = jlib.randomnumber();
		String project="Onlinebanking"+ran;
		String query="insert into project values('TY_PROJ_12345','Jyothi123','29-06-23','"+project+"','created','5')";
		String actdata = dlib.insertdataintoDB(query);
		System.out.println(actdata);
	}

}
