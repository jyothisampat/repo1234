package Deserialization;

import java.io.File;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import pojoClass.Pojo2;

public class EmpdeserializationArray 
{
	@Test
	public void empdesrlizatinarray() throws Throwable, Throwable, Throwable
	{
		ObjectMapper omp = new ObjectMapper();
		Pojo2 rv = omp.readValue(new File("./Projectdata_array.json"), Pojo2.class);
		System.out.println(rv.getCreatedBy());
		System.out.println(rv.getStatus());
		System.out.println(rv.getTeamSize());
		System.out.println(rv.getProjectName()[0]);
		System.out.println(rv.getProjectName()[1]);
		
		
	}

}
