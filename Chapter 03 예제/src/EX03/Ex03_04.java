package EX03;

import java.util.Scanner;

public class Ex03_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ���ڸ� �ϳ� �Է¹ް� 10, 16 , 8 ������ ����ϴ� ���α׷��� ������
		
		int a;
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� ==>  ");
		a = s.nextInt();
		System.out.printf("10���� ==> %d\n" , a);
		System.out.printf("16���� ==> %x\n" , a);
		System.out.printf("8���� ==> %o" , a);
		
		// 10������ %d 16������ %x 8������ %o ���� ����

	}

}
