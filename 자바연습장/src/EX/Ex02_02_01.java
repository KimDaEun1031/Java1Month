package EX;

import java.util.Scanner;

//���� 4���� �Է¹޾� �� ���� ���ϴ� ���α׷��� ������
public class Ex02_02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, c ,d , result;
		
		Scanner s = new Scanner(System.in);
		//�� ���� �ٷ� ­�� ������ new �ڿ� . �ٿ���  / ������ �׳� ������ ���� ����
		
		System.out.print("ù��° ����� ���� �Է��Ͻÿ�. ==>");
		a = s.nextInt();
		System.out.print("�ι�° ����� ���� �Է��Ͻÿ�. ==>");
		b = s.nextInt();
		System.out.print("����° ����� ���� �Է��Ͻÿ�. ==>");
		c = s.nextInt();
		System.out.print("�׹�° ����� ���� �Է��Ͻÿ�. ==>");
		d = s.nextInt();
		
		result = a+b+c+d;
		
		System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + result);
		                                               //d �ڿ� �÷��� �� ���̰� �ϴϱ� ���� ���� / �ٽ� ���̱� ����

	}
}