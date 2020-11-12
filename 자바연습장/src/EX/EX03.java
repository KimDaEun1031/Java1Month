package EX;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//급여명세서를 작성하시오
		
		//기본급 150만원 수당이 55000원 세금 기본급의 10%
		//실수령액 = 기본급 + 시간수당 - 세금
		//시간은 입력
		
		int money = 1500000;
		int tmoney = 55000;
		double tax = (double) (money * 0.1);
		int result = money + tmoney - (int)tax;
		
		System.out.printf("실수령액 : %d", result);

	}

}
