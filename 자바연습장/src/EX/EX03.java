package EX;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�޿������� �ۼ��Ͻÿ�
		
		//�⺻�� 150���� ������ 55000�� ���� �⺻���� 10%
		//�Ǽ��ɾ� = �⺻�� + �ð����� - ����
		//�ð��� �Է�
		
		int money = 1500000;
		int tmoney = 55000;
		double tax = (double) (money * 0.1);
		int result = money + tmoney - (int)tax;
		
		System.out.printf("�Ǽ��ɾ� : %d", result);

	}

}
