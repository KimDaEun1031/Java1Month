package EX08;

import java.util.Scanner;

public class Ex08_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a, b, c, d;
		int result;
		
		System.out.printf("ù��° ���ڸ� �Է��ϼ���. : ");
		a = s.nextInt();
		System.out.printf("�ι�° ���ڸ� �Է��ϼ���. : ");
		b = s.nextInt();
		System.out.printf("����° ���ڸ� �Է��ϼ���. : ");
		c = s.nextInt();
		System.out.printf("�׹�° ���ڸ� �Է��ϼ���. : ");
		d = s.nextInt();
		
		result = a + b + c + d;
		
		System.out.println("�հ� ==>  " + result);
	}
}
