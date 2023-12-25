package serialization;

import java.io.File;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClass.Employee;
import pojoClass.Spouse;

public class EmployeewithObjectserialization 
{
	@Test
	public void empobject() throws Throwable, JsonMappingException, Throwable
	{
		ObjectMapper omp = new ObjectMapper();
		int[] sph= {9876,65487};
		Spouse spouse = new Spouse("sss", 29, sph);
		
		int [] phno= {1234,4321};
		Employee emp = new Employee("jyothi", 25, phno, spouse);
		omp.writeValue(new File("./Projectdataobject.json"), emp);

		
		
	}

}
