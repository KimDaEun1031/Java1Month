package EX;

import java.util.Scanner;

public class Ex06_16_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Էµ� ���ڸ� �Ųٷ� ���
		int str1;
		
		Scanner s = new Scanner(System.in);
		System.out.printf("���ڸ� �Է��Ͻÿ� : ");
		String str = s.nextLine();

		System.out.printf("\n\n�Է��� ���ڿ� ==> %s\n",str);
		System.out.printf("����� ���ڿ� ==> ");
		
		int str2 = str.length();
		for(str1 = str2-1;str1>=0;str1--) {
			System.out.printf("%c",str.charAt(str1));
			
			
		}
		

	}

}
