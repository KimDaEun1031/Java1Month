package debug;

public class Debuging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 100;
		
		System.out.println(count);
		
		int count2 = count + 1;
		
		System.out.println(count2);
		
		Person daeun = new Person();
		daeun.setName("KimDaeun");
		daeun.setAge(23);
		daeun.setGender(Gendertype.WOMAN);
		
		Person nasy = new Person();
		nasy.setName("NaSeoyeon");
		nasy.setAge(49);
		nasy.setGender(Gendertype.WOMAN);
		
		
		
		System.out.println(daeun);
		System.out.println("================");
		System.out.println(nasy);
		
		
		for(int age = 0; age < 100; age++) {
			daeun.setAge(age);
			System.out.println(daeun);
		}
		
	}

}
