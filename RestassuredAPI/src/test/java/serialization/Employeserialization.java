package serialization;

import java.io.File;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import pojoClass.Pojo1;

public class Employeserialization 
{
	@Test
	public void empserilztion() throws Throwable, Throwable, Throwable
	{
		ObjectMapper omp = new ObjectMapper();
		Pojo1 pj=new Pojo1("jyothi", "onlinebanking", "created", "5");
		omp.writeValue(new File("./Projectdata.json"), pj);
	}

}
