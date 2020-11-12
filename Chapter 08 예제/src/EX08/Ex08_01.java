package EX08;

import java.util.Scanner;

public class Ex08_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a, b, c, d;
		int result;
		
		System.out.printf("첫번째 숫자를 입력하세요. : ");
		a = s.nextInt();
		System.out.printf("두번째 숫자를 입력하세요. : ");
		b = s.nextInt();
		System.out.printf("세번째 숫자를 입력하세요. : ");
		c = s.nextInt();
		System.out.printf("네번째 숫자를 입력하세요. : ");
		d = s.nextInt();
		
		result = a + b + c + d;
		
		System.out.println("합계 ==>  " + result);
	}
}
