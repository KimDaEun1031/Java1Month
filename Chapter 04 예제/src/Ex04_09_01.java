import java.util.Scanner;

public class Ex04_09_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("## ��ȯ�� ����? ");
		int money = s.nextInt();
		
		int a;
		int b;
		int c;
		int d;
		
		a = money / 500;
		money = money % 500;
		
		b = money / 100;
		money = money % 100;
		
		c = money / 50;
		money = money % 50;
		
		d = money / 10;
		money = money % 10;
		
		System.out.printf("�����¥�� ==> %d��",a);
		System.out.printf("\n���¥�� ==>   %d��",b);
		System.out.printf("\n���ʿ�¥�� ==> %d��",c);
		System.out.printf("\n�ʿ�¥�� ==>   %d��",d);
		System.out.printf("\n�ٲ��� ���� �ܵ� ==> %d��",money);
	}

}
