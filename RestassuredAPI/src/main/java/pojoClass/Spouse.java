package pojoClass;

public class Spouse 
{
	String name;
	int age;
	int[] phoneNumber;

	public Spouse(String name, int age, int[] phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	
	}
	Spouse(){
		
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
	public int[] getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int[] phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	

}
