package test;

import java.util.Scanner;
//일요일에 다시 합시다.
public class EX02 {

	public static void main(String[] args) {
		//0~9까지의 문자로 된 숫자를 입력 받았을 때, 이 입력 값이 0~9까지의 숫자가 각각 한 번 씩만 사용된 것인지 확인하는 프로그램을 작성하시오
		
		//0~9까지의 숫자로 입력된 문자에서 입력값 0~9까지의 숫자가 각 몇개씩 있는지 확인하는 프로그램을 작성하시오
		Scanner s = new Scanner(System.in);
//		int a, number,temp;
//		int []sem = new int[10];
//		int []count = new int [10];
//		
//		System.out.println("0~9까지의 숫자를 아무거나 입력하시오.(제한 없음)");
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


