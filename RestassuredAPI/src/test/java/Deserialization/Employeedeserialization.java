package Deserialization;

import java.io.File;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import pojoClass.Pojo1;

public class Employeedeserialization // for deserialization empty constructor is mandatory in pojo c
{
	@Test
	public void empdeserialization() throws Throwable, Throwable, Throwable
	{
		 ObjectMapper omp = new ObjectMapper();
		Pojo1 data =omp.readValue(new File("./Projectdata.json"), Pojo1.class);
		System.out.println(data.getCreatedBy());
		System.out.println(data.getProjectName());
		System.out.println(data.getStatus());
		System.out.println(data.getTeamSize());
		
	}
	

}
