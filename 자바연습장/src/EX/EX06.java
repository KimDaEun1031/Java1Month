package EX;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다음을 입력받아 삼각형의 넓이를 구하시오
		//삼각형넓이 = (밑변*높이)/2
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("**** 삼각형의 넓이 구하기 ****");
		System.out.print("밑변 : ");
		int a = s.nextInt();
		System.out.print("높이 : ");
		int b = s.nextInt();
		
		int result = (a*b)/2;
		
		System.out.printf("넓이 : %.2f", (float)result);
		

	}

}
