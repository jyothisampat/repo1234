package pojoClass;

public class Employee 
{
	String name;
	int age;
	int [] phonenumber;
	Spouse spouse;
	public Employee(String name, int age, int[] phonenumber, Spouse spouse) {
		super();
		this.name = name;
		this.age = age;
		this.phonenumber = phonenumber;
		this.spouse = spouse;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int[] getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int[] phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Spouse getSpouse() {
		return spouse;
	}
	public void setSpouse(Spouse spouse) {
		this.spouse = spouse;
	}
	public Employee()
	{
		
	}

}
