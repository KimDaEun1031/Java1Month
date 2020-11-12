package EX03;

import java.util.Scanner;

public class Ex03_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수형 숫자를 하나 입력받고 10, 16 , 8 진수로 출력하는 프로그램을 만들어보자
		
		int a;
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("정수를 입력하세요 ==>  ");
		a = s.nextInt();
		System.out.printf("10진수 ==> %d\n" , a);
		System.out.printf("16진수 ==> %x\n" , a);
		System.out.printf("8진수 ==> %o" , a);
		
		// 10진수는 %d 16진수는 %x 8진수는 %o 잊지 말기

	}

}
