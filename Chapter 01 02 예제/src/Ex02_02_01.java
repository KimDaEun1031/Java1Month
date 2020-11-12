import java.util.Scanner;

public class Ex02_02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 계산한 값을 입력하시오 ==> ");
		int a = s.nextInt();
		System.out.print("두번째 계산한 값을 입력하시오 ==> ");
		int b = s.nextInt();
		System.out.print("세번째 계산한 값을 입력하시오 ==> ");
		int c = s.nextInt();
		System.out.print("네번째 계산한 값을 입력하시오 ==> ");
		int d = s.nextInt();
		
		int result = a + b - c * d;
		System.out.println(a + "+" + b + "-" + c + "*" + d + "=" + result );
		
		
	}

}
