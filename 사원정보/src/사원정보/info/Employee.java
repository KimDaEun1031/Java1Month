package �������.info;

public class Employee {
	private String name;
	private String gender;
	private String emNumber;
	private String position;
	private String team;
	private String email;

	public String getName() {
		return name;
	}




	public void setName(String name) {		
		this.name = name;
	}



	public String getEmNumber() {
		return emNumber;
	}




	public void setEmNumber(String emNumber) {
		this.emNumber = emNumber;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public String getPosition() {
		return position;
	}




	public void setPosition(String position) {
		this.position = position;
	}




	public String getTeam() {
		return team;
	}




	public void setTeam(String team) {
		this.team = team;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public void displayEmpolyee() {
		System.out.println("---------------------");
		System.out.printf("�̸� : \t%s\n�����ȣ : \t%s\n���� : \t%s\n�Ҽ��� : \t%s��\n���� : \t%s\n�̸��� : \t%s\n", name,emNumber,gender,team,position,email);
		System.out.println("---------------------");
	}
}

