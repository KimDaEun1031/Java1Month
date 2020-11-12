package EX03;

import java.util.Scanner;

public class Ex03_05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//시스템 인은 이클립스 시스템 안의 콘솔에 입출력하라  표준입력장치
		int a, b = 0;
		String str;
	
		System.out.print("입력진수 결정 <1>10 <2>16 <3>8 : ");
		a = s.nextInt();
		
		System.out.print("값 입력 : ");
		//if(a == 1) {
		//System.out.printf("10진수 ==> %d \n" , b);
		//System.out.printf("16진수 ==> %x \n" , b);
		//System.out.printf("8진수 ==> %o" , b);    } 
	//내가 한건 이건데 답지를 보고 해봅시다.
		
		//여기에  str = s.next(); 하나만 써놓아도 모두 적용된다 
		if(a == 1) {
			str = s.next();//아래와 같이 많이 쓴다고 좋은 것은 아니다.
			b = Integer.parseInt(str,10);//10진수는 생략가능
			//입력값이 1이면 10진수를 입력받는다.   s.next는 문자열을 입력받고      Integer...는 str을 10진수로 변환한다
		}
		else if(a==2) {
			str = s.next();
			b = Integer.parseInt(str,16);
		}
		else if(a==3) {
			str = s.next();
			b = Integer.parseInt(str,8);
		}
		System.out.printf("10진수 ==> %d \n" , b);
		System.out.printf("16진수 ==> %X \n" , b);//%x 처럼 소문자로 하면 소문자로 나옴
		System.out.printf("8진수 ==> %o" , b);    
		} 
}


