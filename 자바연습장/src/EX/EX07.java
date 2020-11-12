package EX;

import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//포문 도형찍기

		//정사각형 찍기
		for(int i = 0; i<5; i++) {
			System.out.println("* * * * *");
		}
		
		System.out.println();
		
		//정사각형 찍기
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		System.out.println();
		
		//삼각형 찍기
		for(int i = 1; i<5; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		
		System.out.println();
		
		//삼각형 거꾸로 찍기
		for(int i = 4; i>0; i--) {
			for(int j = 0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		System.out.println();
		
		//피라미드 찍기
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
		
		
		//입력된 값을 마름모 형태로 출력하기
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		
		if(num%2==0) {
			System.out.print("짝수는 입력하지 말아주세요");
		} 
		else {//짝수를 입력하지 않았을 때 = 홀수 입력했을 때
		//num=5일 때라면 
		for(int i = 0;i<num;i++) {//i=0일때 처음 했을 때를 기준
			for(int j=0; j<num;j++) {//다 돌았을 때 25번 실행
				if (i<=num/2) {//다 돌았을 때 3번 반복
					if(i+j<=num/2-1) //사칙연산 헷갈려하지 말기..
						System.out.print(" ");//j=0,1일 때 실행
					else if (j-i>=num/2+1)
						System.out.print(" ");//j=3.4일 때 실행
					else
						System.out.print("*");//j=2일 때 실행
				}
				else if (i>num/2) {//2번반복
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
