package ClassEx;

import java.util.Scanner;

class Calc {
	static int sum(int num1, int num2) {
		return num1 + num2;
	}
}

public class EX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("���� 2���� �Է����ּ���.");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		System.out.println("������ �� : "+Calc.sum(num1, num2));
		
		s.close();//���� �ݾ��� �ʿ�� ������ �ݴ� ������ ������
	}

}
