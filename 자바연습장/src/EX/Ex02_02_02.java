package EX;
//덧셈, 뻴셈, 곱셈, 나눗셈 중 하나를 선택하여 계산하는 프로그램을 if문을 활용하여 만들어보자
import java.util.Scanner;

public class Ex02_02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a , b, c, result;
		
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 값을 입력하시오. ==> ");
		a = s.nextInt();
		System.out.print("<1>덧셈 <2> 뺄셈 <3> 곱셈 <4> 나눗셈  ==> ");
		c = s.nextInt();
		System.out.print("두번째 값을 입력하시오. ==> ");
		b = s.nextInt();
		if(c == 1) {
			result = a+b;
			System.out.println(a + "+" + b + "=" + result);
			}
		else if(c == 2) {
			result = a-b;
			System.out.println(a + "-" + b + "=" + result);
			}
		else if(c == 3) {
			result = a*b;
			System.out.println(a + "*" + b + "=" + result);
			}
		else if(c == 4) {
			result = a/b;
			System.out.println(a + "/" + b + "=" + result);
			}
		
		//그 후에 else를 넣어서 잘못 입력되었을 때의 부분을 하니까 트루여도 잘못입력부분이 나오더라
		// 이건 추후 if를 더 자세하게 배우면 알라나? 전날 수업에서는 주영우라는 분이 잘못 입력했을 때의 나오는 서식을
		// 물어봤는데 아직 모르겠네 / 마인크래프트 식으로 한 번 해볼까?
	}

}
