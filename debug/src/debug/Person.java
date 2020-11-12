package debug;

public class Person {
	private String name;
	private int age;
	private int phonNumber;
	private Gendertype gender;
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
	public int getPhonNumber() {
		return phonNumber;
	}
	public void setPhonNumber(int phonNumber) {
		this.phonNumber = phonNumber;
	}
	public Gendertype getGender() {
		return gender;
	}
	public void setGender(Gendertype gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", phonNumber=");
		builder.append(phonNumber);
		builder.append(", gender=");
		builder.append(gender);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
