package EX;

import java.util.Scanner;

public class Ex06_16_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력된 문자를 거꾸로 출력
		int str1;
		
		Scanner s = new Scanner(System.in);
		System.out.printf("글자를 입력하시오 : ");
		String str = s.nextLine();

		System.out.printf("\n\n입력한 문자열 ==> %s\n",str);
		System.out.printf("출력한 문자열 ==> ");
		
		int str2 = str.length();
		for(str1 = str2-1;str1>=0;str1--) {
			System.out.printf("%c",str.charAt(str1));
			
			
		}
		

	}

}
