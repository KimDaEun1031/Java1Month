import java.io.IOException;
import java.util.Scanner;

public class Ex02_02_03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int result;
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.print("ù��° ����� ���� �Է��ϼ���. ==> ");
			int a = s.nextInt();
			System.out.print("+ - * / % �����Ͻÿ� ==> ");
			char b = (char)System.in.read();
			
			
			
			System.out.print("�ι�° ����� ���� �Է��ϼ���. ==> ");
			
			
			
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
					System.out.println("0���� ������ �ȵ˴ϴ�.");	
			}
			if( b == '%' ) { 
				if( c != 0 ) {
				result = a % b;
				System.out.println(a + "%" + c + "=" + result);
				} else
					System.out.println("0���� ������ ������ ���� �ȵ˴ϴ�.");	

			}
		}
	}

}
