package mesod;

import java.util.Scanner;

public class Mex01 {

	public static void main(String[] args) {
		//���ڿ� ����� �и��ϱ�
		
		String name = "Kim Da Eun";
		
		String Firstname = "";
		String Lastname = "";
		
		if (name.contains("Da")) {
			name = name.replace("Da", "Yu");
					System.out.println(name);
		}
		
		Firstname = name.substring(0,3);
		Lastname = name.substring(4);

		System.out.println("�� : "+Firstname);
		System.out.println("�̸� : "+Lastname);
		
		System.out.println("------------------------------");
		//���� ���ڿ��� �����ϰ� �и��ϱ�
		Scanner s = new Scanner(System.in);
		System.out.print("�̸� : ");
		name = s.nextLine();

		Firstname = name.substring(0,3);
		Lastname = name.substring(4);

		System.out.println("�� : "+Firstname);
		System.out.println("�̸� : "+Lastname);
	}

}
