package test;

import java.util.Scanner;
//�Ͽ��Ͽ� �ٽ� �սô�.
public class EX02 {

	public static void main(String[] args) {
		//0~9������ ���ڷ� �� ���ڸ� �Է� �޾��� ��, �� �Է� ���� 0~9������ ���ڰ� ���� �� �� ���� ���� ������ Ȯ���ϴ� ���α׷��� �ۼ��Ͻÿ�
		
		//0~9������ ���ڷ� �Էµ� ���ڿ��� �Է°� 0~9������ ���ڰ� �� ��� �ִ��� Ȯ���ϴ� ���α׷��� �ۼ��Ͻÿ�
		Scanner s = new Scanner(System.in);
//		int a, number,temp;
//		int []sem = new int[10];
//		int []count = new int [10];
//		
//		System.out.println("0~9������ ���ڸ� �ƹ��ų� �Է��Ͻÿ�.(���� ����)");
//		number = s.nextInt();
//
//		// number = 9402
//				for(int i = 0;i<sem.length;i++) {
//					a = number%10;
//					System.out.println(a);
//					sem[i] = a;
//				}
//				
//		for(int i = 0; i <sem.length;i++) {
//			System.out.print(sem[i]);
//		}
//		
		//  0  1  2  3  4  5  6  7  8 
 		int a0, a1, a2, a3, a4, a5, a6, a7, a8, a9;
 		a0 = 1;
 		a0 = a0 + 1;
 		a0 = a0 + 1;
 		a0 = a0 + 1;
 		a0 = a0 + 1;
 		a0 = a0 + 1;
 		a0 = a0 + 1;
 		
 		a1 = 1;
 		a1 = a1 + 1;
 		 
 		
 		for(int i = 0; i < 1000 ; i ++) {
 			int number = s.nextInt();
 			System.out.println(number);
 		}
	}
}


