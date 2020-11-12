package ClassEx;

import java.util.Scanner;

class Calc {
	static int sum(int num1, int num2) {
		return num1 + num2;
	}
}

public class EX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("정수 2개를 입력해주세요.");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		System.out.println("정수의 합 : "+Calc.sum(num1, num2));
		
		s.close();//굳이 닫아줄 필요는 없지만 닫는 습관을 가지기
	}

}
