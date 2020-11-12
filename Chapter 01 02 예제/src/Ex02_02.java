import java.util.Scanner;

public class Ex02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		int result;
		                       //입력 콘솔에 입력하라는 뜻
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 계산한 값을 입력하시오 ==> ");
		a = s.nextInt();
		System.out.print("두번째 계산한 값을 입력하시오 ==> ");
		b = s.nextInt();
		
		result = a + b;
		System.out.println(a + "+" + b + "=" + result);
		
		result = a - b;
		System.out.println(a + "-" + b + "=" + result);
		
		result = a * b;
		System.out.println(a + "*" + b + "=" + result);
		
		result = a / b;
		System.out.println(a + "/" + b + "=" + result);
		
	}

}
