package Fruit;

import java.util.Scanner;

public class FruitSeller2 {
	
	public static void main(String [] ars) {
		
		int smoney, bmoney, applevalue, tell, sapple, bapple, debt;
		
		smoney = 0; //������� ��
		bmoney = 0; // �� �� 
		applevalue = 0; // ��� ����
		sapple = 0; // ��������� ������ �ִ� ��� ����
		bapple = 0; // ���� ������ �ִ� ��� ����
		debt = 0; //�� 
		
	
		
		Scanner s = new Scanner(System.in);
		System.out.print("��������� ���� �Է��ϼ���.\t=>\t");
		smoney = s.nextInt();
		System.out.print("�������� ���� �Է��ϼ���.\t=>\t");
		bmoney = s.nextInt();
		System.out.print("��� ������ �Է��ϼ���.\t=>\t");
		applevalue = s.nextInt();
		System.out.print("��������� ������ �ִ� ��� ������ �Է��ϼ���.\t=>\t");
		sapple = s.nextInt();
		System.out.print("�����ڰ� ������ �ִ� ��� ������ �Է��ϼ���.\t=>\t");
		bapple = s.nextInt();
		System.out.print("����� �󸶳� ��ſ�?");
		tell = s.nextInt();
		
		
		int apple = tell; // apple = ��� ����   �Է��� ��� ����(tell)�� apple�� ����
		applevalue *= apple;   // apple ������ ��� ���ݿ� ���ؼ� ����
		sapple = sapple-apple; // ��������� ����� �� ��� ���� ��ŭ ����
		bapple = bapple+apple; // ��������� ����� �� ��� ���� ��ŭ ���ϱ�
		bmoney = bmoney-applevalue; // ��� ������ŭ ��� ������ �� ������ ����
		smoney = smoney+applevalue; // ��� ������ŭ ��� ������ ������� ���� ���ϱ�
		
		
		System.out.println("���� ������� ���� ��� ���� : " +sapple);
		System.out.println("���� ����� �� : " +smoney);
		System.out.println("���� ���� ��� ���� : " +bapple);
		System.out.println("���� ���� �� : " +bmoney);
		
		if(bmoney<0) { // �� ���� ������� 
			System.out.println("���� ������ϴ�.");
			debt = bmoney; // ���� ����
			bmoney = 0;	
			System.out.println("���� �� : " +debt);
		}
	}		
}
		
	
	
	
	


