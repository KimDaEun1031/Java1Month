package ClassEx;

import java.util.Scanner;

class Showname {
	void showName(String name) {
		System.out.println("���� "+name+"�Դϴ�.");
	}
}

public class EX05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("�̸��� �Է����ּ��� : ");
		String name = s.next();
		
		Showname myName = new Showname();
		myName.showName(name);
		
		s.close();

	}

}
