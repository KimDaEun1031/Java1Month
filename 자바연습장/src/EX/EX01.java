package EX;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		//���� 1 ���ǹ��� Ȱ���Ͽ� �Է��� �� ��ŭ ���� �ݺ��ؼ� ����� ��
		//���� 2 � ���� 3,4,5,8�� �������� �� ������ �������� ���� Ư���� ������ �̸� �ο�
		//���� 3 ���ÿ� ������ �������� ���ڰ� �ִٸ� �����̸��� �������� �����ǵ��� �Ұ�
		//�ϴܿ� ��µ� ������ �̸��� ī��Ʈ�ؼ� Ƚ���� �����ϱ�
		
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� ==>");
		int sem = s.nextInt();
		int cCount = 0;//����� ī��Ʈ
		int dCount = 0;//������ ī��Ʈ
		int bCount = 0;//�� ī��Ʈ
		int tCount = 0;//ȣ���� ī��Ʈ
		
		for(int a = 1; a <= sem; a++) {//a�� sem��ŭ �ݺ��϶�
			System.out.print(a + ".");
			if(a%3==0) {//a�� 3���� ���� �������� 0�̶�� 
				System.out.print("cat ");
				cCount += 1; //1�� ���ذ���
			}
			if(a%4==0) {
				System.out.print("dog ");
				dCount += 1;
			}
			if(a%5==0) {
				System.out.print("bear ");
				bCount += 1;
			}
			if(a%8==0) {
				System.out.print("tiger ");
				tCount += 1;
			}
			System.out.println();
		}
		
		System.out.printf("���� ����\n");
		System.out.printf("������� ���ڴ� %d����\n", cCount);
		System.out.printf("�������� ���ڴ� %d����\n", dCount);
		System.out.printf("���� ���ڴ� %d����\n", bCount);
		System.out.printf("ȣ������ ���ڴ� %d����\n", tCount);

	}

}
