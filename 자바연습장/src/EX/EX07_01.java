package EX;

import static java.lang.Math.sqrt; //������(��Ʈ) ���ϴ� Ŭ����

import java.util.Scanner;

public class EX07_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �׸���
		
		Scanner s = new Scanner(System.in);
		int i ,j , n ;
		
		System.out.print("n�� �� ���ڸ� �Է��Ͻÿ� : ");
		n = s.nextInt();
		
		 for (i = 0; i <= n * 2; i++) {
	            for (j = 0; j <= n * 2; j++) {
	                //���� �߽���ǥ(n,n)�κ��� (i,j)������ �Ÿ��� ����
	                int d = (int) sqrt((i - n) * (i - n) + (j - n) * (j - n));
	                //�տ� ���� �� ��ȯ�� ���� ������ sqrt Ŭ������ ���������� ������� �Ǳ� �����̴�. 
	                //(i,j)��ǥ�� (n,n)������ �Ÿ��� �������Ǳ��� �����϶�  ��ǥ�� ��´�.
	                if (d <= n) {
	                    System.out.print("*  ");
	                } else {
	                    System.out.print("   ");
	                }
	            }
	            System.out.println();
	        }
		 //�л�񵿱����α׷� - �Լ��� ���α׷��� ���� ���� ��
	}
}
