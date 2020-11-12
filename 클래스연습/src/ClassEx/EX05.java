package ClassEx;

import java.util.Scanner;

class Showname {
	void showName(String name) {
		System.out.println("나는 "+name+"입니다.");
	}
}

public class EX05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : ");
		String name = s.next();
		
		Showname myName = new Showname();
		myName.showName(name);
		
		s.close();

	}

}
