package EX;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ �Է¹޾� �ﰢ���� ���̸� ���Ͻÿ�
		//�ﰢ������ = (�غ�*����)/2
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("**** �ﰢ���� ���� ���ϱ� ****");
		System.out.print("�غ� : ");
		int a = s.nextInt();
		System.out.print("���� : ");
		int b = s.nextInt();
		
		int result = (a*b)/2;
		
		System.out.printf("���� : %.2f", (float)result);
		

	}

}
