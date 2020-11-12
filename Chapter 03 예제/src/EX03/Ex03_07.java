package EX03;

import java.util.Scanner;

public class Ex03_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		System.out.print("문자열을 입력 ==>");
		str = s.nextLine();
		
		for(int a = str.length() -1; a >= 0;a--) {
			//ex)문자열을 " I Love You " 라고 입력했을 경우 I 부터 u 까지 총 10개의 문자가 들어간다.
			//배열로 생각하면 0부터 9까지 10개의 공간이 있는 str 변수라고 생각하면 된다.
			//초기값에 변수 a는 str의 길이를 -1한 값이다 라고 하니 길이가 10이니까 -1을 하면 9가 된다. 그럼 맨 마지막 배열 숫자인 9부터 시작한다.
			//자 이제 조건식을 살펴보면 a가 0보다 크거나 작을 때 까지 반복하라고 써있으니 9부터 0까지 계속 반복하면 된다.
			//모든 조건이 만족을 하니 아래를 살펴보자
				System.out.printf("%c", str.charAt(a));
				//%c는 문자열 출력하는 걸로 알면 됨
				//str.charAt은 배열의 인덱스 안에 있는 숫자를 추출한다.
				//처음걸로 하면 9가 들어가니 맨 뒤에인 u가 된다 그다음은 8이니 o가 추출되서 거꾸로 추출이 된다.
		}
		System.out.println();
	}
}
