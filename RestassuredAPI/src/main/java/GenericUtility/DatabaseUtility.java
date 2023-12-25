package GenericUtility;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DatabaseUtility
{
	Driver driverRef;
	Connection con;
	public void connectToDB() throws SQLException
	{
		driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		con=DriverManager.getConnection(IConstants.dbURL,IConstants.dbUserName,IConstants.dbPassword);
	}
	
	public void closeDB() throws SQLException
	{
		con.close();
	}
	
	public String readDatafromDBandValidate(String query, int columnIndex, String expData) throws SQLException
	{
		boolean flag=false;
		ResultSet result = con.createStatement().executeQuery(query);
		while(result.next())
		{
			if(result.getString(columnIndex).equalsIgnoreCase(expData))
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("verified");
			return expData;
		}
		else
		{
			System.out.println("not verified");
			return " ";
		}
		
		
	}
	public String insertdataintoDB(String Query) throws SQLException
	{
		Statement Statement = con.createStatement();
		int result = Statement.executeUpdate(Query);
		if(result==1)
		{
			System.out.println("data is added");
		}
		else
		{
			System.out.println("data is not added");
		}
		return " ";
		
		
	}
	

}
