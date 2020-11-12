package EX08;

import java.util.Scanner;

public class Ex08_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int first, second;
		
		System.out.printf("행의 개수를 입력하시오 : ");
		first = s.nextInt();
		System.out.printf("열의 개수를 입력하시오 : ");
		second = s.nextInt();
		
		int array [][] = new int[first][second];
		int val = 1;
		
		for(int i = 0; i<first;i++) {
			for(int k = 0;k<second;k++) {
				array[i][k] = val;
				val++;
			}
		}
		System.out.printf("array[0][0]부터 array[%d][%d]까지 출력\n",first,second);
		for(int i = 0; i<first;i++) {
			for(int k = 0;k<second;k++) {
				System.out.printf("%3d",array[i][k]);
			}
			System.out.println();
		}

	}

}
