package EX03;

import java.util.Scanner;

public class Ex03_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		System.out.print("���ڿ��� �Է� ==>");
		str = s.nextLine();
		
		for(int a = str.length() -1; a >= 0;a--) {
			//ex)���ڿ��� " I Love You " ��� �Է����� ��� I ���� u ���� �� 10���� ���ڰ� ����.
			//�迭�� �����ϸ� 0���� 9���� 10���� ������ �ִ� str ������� �����ϸ� �ȴ�.
			//�ʱⰪ�� ���� a�� str�� ���̸� -1�� ���̴� ��� �ϴ� ���̰� 10�̴ϱ� -1�� �ϸ� 9�� �ȴ�. �׷� �� ������ �迭 ������ 9���� �����Ѵ�.
			//�� ���� ���ǽ��� ���캸�� a�� 0���� ũ�ų� ���� �� ���� �ݺ��϶�� �������� 9���� 0���� ��� �ݺ��ϸ� �ȴ�.
			//��� ������ ������ �ϴ� �Ʒ��� ���캸��
				System.out.printf("%c", str.charAt(a));
				//%c�� ���ڿ� ����ϴ� �ɷ� �˸� ��
				//str.charAt�� �迭�� �ε��� �ȿ� �ִ� ���ڸ� �����Ѵ�.
				//ó���ɷ� �ϸ� 9�� ���� �� �ڿ��� u�� �ȴ� �״����� 8�̴� o�� ����Ǽ� �Ųٷ� ������ �ȴ�.
		}
		System.out.println();
	}
}
