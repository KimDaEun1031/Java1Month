package EX08;

import java.util.Scanner;

public class Ex08_08_02 {//���߿� �ٽ� ������

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int [][] exams = new int[5][4]; //�л��� 5�� ������ 4��
		for(int i = 0; i < exams.length; ++i) { //i�� ���� ������ ���� �� 5�� �ݺ� ù��° �迭
			System.out.printf("%d �л��� ������ �Է��ϼ���..\n", i); //�л� 0~4����
			for(int j = 0; j < exams[i].length; ++j) {//�ι�° �迭 �ݺ�
				System.out.printf("%d ��° ���� ���� : ", j);//���� ���� 4�� 
				exams[i][j] = s.nextInt();
			}
		}
		
		for(int i = 0; i < exams.length; ++i) {
			System.out.printf("%d �л� -----------------\n", i);//ù��° �迭 5�� �ݺ�
			int total = 0;
			for(int j = 0; j < exams[i].length; ++j) {
				System.out.printf("%d ��° ���� : %d\t", j, exams[i][j]);
				total += exams[i][j];
			}
			System.out.printf("��� : %d\n", total/exams[i].length);
		}
		
	}

}
