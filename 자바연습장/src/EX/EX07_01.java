package EX;

import static java.lang.Math.sqrt; //제곱근(루트) 구하는 클래스

import java.util.Scanner;

public class EX07_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//원형 그리기
		
		Scanner s = new Scanner(System.in);
		int i ,j , n ;
		
		System.out.print("n에 들어갈 숫자를 입력하시오 : ");
		n = s.nextInt();
		
		 for (i = 0; i <= n * 2; i++) {
	            for (j = 0; j <= n * 2; j++) {
	                //원의 중심좌표(n,n)로부터 (i,j)사이의 거리를 구함
	                int d = (int) sqrt((i - n) * (i - n) + (j - n) * (j - n));
	                //앞에 강제 형 변환을 해준 이유는 sqrt 클래스가 더블형으로 입출력이 되기 때문이다. 
	                //(i,j)좌표가 (n,n)사이의 거리가 반지름의길이 이하일때  좌표를 찍는다.
	                if (d <= n) {
	                    System.out.print("*  ");
	                } else {
	                    System.out.print("   ");
	                }
	            }
	            System.out.println();
	        }
		 //분산비동기프로그램 - 함수형 프로그래밍 제일 좋은 거
	}
}
