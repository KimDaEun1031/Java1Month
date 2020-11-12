package EX08;

import java.util.Scanner;

public class Ex08_11_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length;
		int car_number;
		char car_name = 'A';
		
		Scanner s = new Scanner(System.in);
		System.out.printf("자동차가 들어갈 터널의 길이를 입력하시오. : ");
		length = s.nextInt();
		System.out.printf("들어갈 자동차의 개수를 입력하시오. : ");
		car_number = s.nextInt();
		
		char [] stack = new char [length];
		int top = stack.length;
		
		if(car_number==0) {
			System.out.printf("!오류! 들어갈 자동차가 없습니다.");
			System.out.printf("프로그램을 종료합니다.");
		}
		
		for(top=0;top<car_number;top++) {		
			if(car_number>=length) {
				System.out.printf("!오류! 자동차가 넘쳐납니다\n");
				System.out.printf("프로그램을 종료합니다.");
				break;
				} else {			
				System.out.printf("%c 자동차가 들어갑니다.\n",car_name);
				car_name++;
				}
			} 
		System.out.printf("\n터널의 길이는 %d이고, 들어간 자동차의 개수는 %d입니다.\n",length,top);
		System.out.printf("남아있는 터널의 길이는 %d입니다\n\n",length-top);
	
	}
}
