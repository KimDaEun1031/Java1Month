package EX;

import java.util.Scanner;

public class Ex03_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for�� int i�� 1�̰� ���ǽ����� ���ڿ� ���̸� -1�Ѵ�. i�� ����
		// str.charAt
		
		String str;
		Scanner s = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ��� ==>\t");
		str = s.nextLine();
		for(int i = str.length() -1; i >= 0;--i) {
			System.out.printf("%c", str.charAt(i));
		}

	}

}
