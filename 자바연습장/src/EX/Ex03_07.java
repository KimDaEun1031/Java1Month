package EX;

import java.util.Scanner;

public class Ex03_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for문 int i가 1이고 조건식으로 문자열 길이를 -1한다. i는 감소
		// str.charAt
		
		String str;
		Scanner s = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 ==>\t");
		str = s.nextLine();
		for(int i = str.length() -1; i >= 0;--i) {
			System.out.printf("%c", str.charAt(i));
		}

	}

}
