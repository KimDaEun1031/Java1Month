package EX08;

import java.util.Scanner;

public class Ex08_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int first, second;
		
		System.out.printf("���� ������ �Է��Ͻÿ� : ");
		first = s.nextInt();
		System.out.printf("���� ������ �Է��Ͻÿ� : ");
		second = s.nextInt();
		
		int array [][] = new int[first][second];
		int val = 1;
		
		for(int i = 0; i<first;i++) {
			for(int k = 0;k<second;k++) {
				array[i][k] = val;
				val++;
			}
		}
		System.out.printf("array[0][0]���� array[%d][%d]���� ���\n",first,second);
		for(int i = 0; i<first;i++) {
			for(int k = 0;k<second;k++) {
				System.out.printf("%3d",array[i][k]);
			}
			System.out.println();
		}

	}

}
