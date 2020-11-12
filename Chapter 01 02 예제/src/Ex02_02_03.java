import java.io.IOException;
import java.util.Scanner;

public class Ex02_02_03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int result;
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.print("첫번째 계산할 값을 입력하세요. ==> ");
			int a = s.nextInt();
			System.out.print("+ - * / % 선택하시오 ==> ");
			char b = (char)System.in.read();
			
			
			
			System.out.print("두번째 계산할 값을 입력하세요. ==> ");
			
			
			
			int c = s.nextInt();
			
			
			if( b == '+' ) {
				result = a + b; 
				System.out.println(a + "+" + c + "=" + result);
				}
			if( b == '-' ) {
				result = a - b;
				System.out.println(a + "-" + c + "=" + result);
				}
			if( b == '*' ) {
				result = a * b;
				System.out.println(a + "*" + c + "=" + result);
				}
			if( b == '/' ) { 
				if( c != 0 ) {
				result = a / b;
				System.out.println(a + "/" + c + "=" + result);
				} else
					System.out.println("0으로 나누면 안됩니다.");	
			}
			if( b == '%' ) { 
				if( c != 0 ) {
				result = a % b;
				System.out.println(a + "%" + c + "=" + result);
				} else
					System.out.println("0으로 나누면 나머지 값이 안됩니다.");	

			}
		}
	}

}
