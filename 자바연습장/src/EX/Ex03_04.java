package EX;

import java.util.Scanner;

public class Ex03_04 {
// ������ ���ڸ� �ϳ� �Է¹ް� 10, 16, 8 ������ ����ϴ� ���α׷��� ������.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� ==>\t");
		a = s.nextInt();
		
		System.out.printf("10����  ==> %d\n" , a);
		System.out.printf("16����  ==> %X\n" , a);
		System.out.printf("8����  ==>  %o" , a);
		
	}

}
