package serialization;

import java.io.File;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojoClass.Pojo2;

public class EmpserializationArray 
{
	@Test
	public void empArrayserilztn() throws Throwable, JsonMappingException, Throwable
	{
		String[] projectName= {"bank1","bank2"};
		ObjectMapper omp = new ObjectMapper();
		Pojo2 pj = new Pojo2("jyothi",projectName,"ongoing","5");
		omp.writeValue(new File("./Projectdata_array.json"), pj);
	}

}
