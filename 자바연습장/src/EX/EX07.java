package EX;

import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �������

		//���簢�� ���
		for(int i = 0; i<5; i++) {
			System.out.println("* * * * *");
		}
		
		System.out.println();
		
		//���簢�� ���
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		System.out.println();
		
		//�ﰢ�� ���
		for(int i = 1; i<5; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		
		System.out.println();
		
		//�ﰢ�� �Ųٷ� ���
		for(int i = 4; i>0; i--) {
			for(int j = 0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		System.out.println();
		
		//�Ƕ�̵� ���
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<3-i;j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println();
		
		
		//�Էµ� ���� ������ ���·� ����ϱ�
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		
		if(num%2==0) {
			System.out.print("¦���� �Է����� �����ּ���");
		} 
		else {//¦���� �Է����� �ʾ��� �� = Ȧ�� �Է����� ��
		//num=5�� ����� 
		for(int i = 0;i<num;i++) {//i=0�϶� ó�� ���� ���� ����
			for(int j=0; j<num;j++) {//�� ������ �� 25�� ����
				if (i<=num/2) {//�� ������ �� 3�� �ݺ�
					if(i+j<=num/2-1) //��Ģ���� �򰥷����� ����..
						System.out.print(" ");//j=0,1�� �� ����
					else if (j-i>=num/2+1)
						System.out.print(" ");//j=3.4�� �� ����
					else
						System.out.print("*");//j=2�� �� ����
				}
				else if (i>num/2) {//2���ݺ�
					if (i-j>=num/2+1)
						System.out.print(" ");
					else if (i+j>=num/2*3+1)
						System.out.print(" ");
					else
						System.out.print("*");
					
				}

			}
			System.out.println();
			}
		}
	

	}
}
