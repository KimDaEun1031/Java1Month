import java.util.Scanner;

public class Ex04_10_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("연도를 입력하세요 : ");
		int year = s.nextInt();
		
		int a = year%4;
		int b = year%400;
		int c = year%100;
		
		if(a==0) {
			System.out.printf("%d년은 윤년입니다.",year);
		}
		else if(b==0) {
			System.out.printf("%d년은 윤년입니다.",year);
		}
		else if(c!=0) {
			System.out.printf("%d년은 윤년이 아닙니다.",year);
			
		}
		
		//책 예제는 논리를 활용해서 하라고는 예상했지만 진짜였다..
		if(((year%4==0) && (year%100!=0) || (year%400==0))) {
			System.out.printf("\n\n%d년은 윤년입니다", year);
		}
		else {
			System.out.printf("%d년은 윤년이 아닙니다.",year);
		}
		
	}

}
