package mesod;

import java.util.Scanner;

public class Mex01 {

	public static void main(String[] args) {
		//문자열 변경과 분리하기
		
		String name = "Kim Da Eun";
		
		String Firstname = "";
		String Lastname = "";
		
		if (name.contains("Da")) {
			name = name.replace("Da", "Yu");
					System.out.println(name);
		}
		
		Firstname = name.substring(0,3);
		Lastname = name.substring(4);

		System.out.println("성 : "+Firstname);
		System.out.println("이름 : "+Lastname);
		
		System.out.println("------------------------------");
		//적힌 문자열을 변경하고 분리하기
		Scanner s = new Scanner(System.in);
		System.out.print("이름 : ");
		name = s.nextLine();

		Firstname = name.substring(0,3);
		Lastname = name.substring(4);

		System.out.println("성 : "+Firstname);
		System.out.println("이름 : "+Lastname);
	}

}
