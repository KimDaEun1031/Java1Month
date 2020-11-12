import java.io.IOException;
import java.util.Scanner;

public class Ex07_04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a,b;
		char ch;
		
		while(true) {
			System.out.printf("첫번째 수 입력 : ");
			a = s.nextInt();
			System.out.printf("두번째 수 입력 : ");
			b = s.nextInt();
			System.out.printf("연산자 입력 : ");
			ch = (char) System.in.read();
			if(ch=='!') {
				System.out.printf("다시 실행해주세요.");
				break;
			}
			
			switch(ch) {
			case '+' :
				System.out.printf("%d + %d = %d 입니다.\n", a, b, a+b); break;
			case '-' :
				System.out.printf("%d - %d = %d 입니다.\n", a, b, a-b); break;
			case '*' :
				System.out.printf("%d * %d = %d 입니다.\n", a, b, a*b); break;
			case '/' :
				System.out.printf("%d / %d = %d 입니다.\n", a, b, a/b); break;
			case '%' :
				System.out.printf("%d %% %d = %d 입니다.\n", a, b, a%b); break;
			default :
				System.out.printf("연산자를 잘못입력했습니다. \n"); break;
			}
			
		}
	}

}
