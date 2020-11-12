package EX;

import java.util.Scanner;

public class Ex03_04 {
// 정수형 숫자를 하나 입력받고 10, 16, 8 진수로 출력하는 프로그램을 만들어보자.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner s = new Scanner(System.in);
		System.out.print("정수를 입력하세요 ==>\t");
		a = s.nextInt();
		
		System.out.printf("10진수  ==> %d\n" , a);
		System.out.printf("16진수  ==> %X\n" , a);
		System.out.printf("8진수  ==>  %o" , a);
		
	}

}
