package EX;

import java.util.Scanner;

//숫자 4개를 입력받아 그 합을 구하는 프로그램을 만들어보자
public class Ex02_02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, c ,d , result;
		
		Scanner s = new Scanner(System.in);
		//안 보고 바로 짯을 때에는 new 뒤에 . 붙였음  / 원래는 그냥 띄어쓰기임 잊지 말기
		
		System.out.print("첫번째 계산할 값을 입력하시오. ==>");
		a = s.nextInt();
		System.out.print("두번째 계산할 값을 입력하시오. ==>");
		b = s.nextInt();
		System.out.print("세번째 계산할 값을 입력하시오. ==>");
		c = s.nextInt();
		System.out.print("네번째 계산할 값을 입력하시오. ==>");
		d = s.nextInt();
		
		result = a+b+c+d;
		
		System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + result);
		                                               //d 뒤에 플러스 안 붙이고 하니까 에러 떳음 / 다시 붙이긴 했음

	}
}