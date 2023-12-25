package Deserialization;

import java.io.File;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClass.Employee;

public class Employedesierializationobject 
{
	@Test
	public void empdeseriobj() throws Throwable, Throwable, Throwable
	{
		ObjectMapper obj = new ObjectMapper();
		Employee rv = obj.readValue(new File("./Projectdataobject.json"), Employee.class);
		System.out.println(rv.getAge());
		System.out.println(rv.getName());
		System.out.println(rv.getPhonenumber()[0]);
		System.out.println(rv.getPhonenumber()[1]);
		System.out.println(rv.getSpouse().getAge());
		System.out.println(rv.getSpouse().getName());
		System.out.println(rv.getSpouse().getPhoneNumber()[0]);
		System.out.println(rv.getSpouse().getPhoneNumber()[1]);
	}

}
