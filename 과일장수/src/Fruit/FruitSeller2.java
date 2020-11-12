package Fruit;

import java.util.Scanner;

public class FruitSeller2 {
	
	public static void main(String [] ars) {
		
		int smoney, bmoney, applevalue, tell, sapple, bapple, debt;
		
		smoney = 0; //과일장수 돈
		bmoney = 0; // 내 돈 
		applevalue = 0; // 사과 가격
		sapple = 0; // 과일장수가 가지고 있는 사과 개수
		bapple = 0; // 내가 가지고 있는 사과 개수
		debt = 0; //빚 
		
	
		
		Scanner s = new Scanner(System.in);
		System.out.print("과일장수의 돈을 입력하세요.\t=>\t");
		smoney = s.nextInt();
		System.out.print("구매자의 돈을 입력하세요.\t=>\t");
		bmoney = s.nextInt();
		System.out.print("사과 가격을 입력하세요.\t=>\t");
		applevalue = s.nextInt();
		System.out.print("과일장수가 가지고 있는 사과 개수를 입력하세요.\t=>\t");
		sapple = s.nextInt();
		System.out.print("구매자가 가지고 있는 사과 개수를 입력하세요.\t=>\t");
		bapple = s.nextInt();
		System.out.print("사과를 얼마나 살거요?");
		tell = s.nextInt();
		
		
		int apple = tell; // apple = 사과 개수   입력한 사과 개수(tell)을 apple에 대입
		applevalue *= apple;   // apple 개수를 사과 가격에 곱해서 대입
		sapple = sapple-apple; // 과일장수의 사과를 산 사과 개수 만큼 빼기
		bapple = bapple+apple; // 과일장수의 사과를 산 사과 개수 만큼 더하기
		bmoney = bmoney-applevalue; // 사과 개수만큼 사과 가격을 내 돈에서 빼기
		smoney = smoney+applevalue; // 사과 개수만큼 사과 가격을 과일장수 돈에 더하기
		
		
		System.out.println("과일 장수에게 남은 사과 개수 : " +sapple);
		System.out.println("과일 장수의 돈 : " +smoney);
		System.out.println("내가 가진 사과 개수 : " +bapple);
		System.out.println("내게 남은 돈 : " +bmoney);
		
		if(bmoney<0) { // 내 돈이 음수라면 
			System.out.println("빚이 생겼습니다.");
			debt = bmoney; // 빚에 대입
			bmoney = 0;	
			System.out.println("현재 빚 : " +debt);
		}
	}		
}
		
	
	
	
	


