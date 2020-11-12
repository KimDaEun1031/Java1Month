import java.util.Scanner;

public class Ex05_11_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//단순 if문을 활용하여 두수의 + - * / %
		Scanner s = new Scanner(System.in);
		int first, second;
		char op;
		
		System.out.printf("첫번째 수를 입력하세요 : ");
		first = s.nextInt();
		
		System.out.printf("계산할 연산자를 입력하세요 : ");
		op = s.next().charAt(0);
		
		System.out.printf("두번째 수를 입력하세요 : ");
		second = s.nextInt();
		
		if (op=='+')
			System.out.printf("%d + %d = %d \n", first, second, first+second);
		if (op=='-')
			System.out.printf("%d - %d = %d \n", first, second, first-second);
		if (op=='*')
			System.out.printf("%d * %d = %d \n", first, second, first*second);
		if (op=='/')
			System.out.printf("%d / %d = %d \n", first, second, first/second);
		if (op=='%')
			System.out.printf("%d %% %d = %d \n", first, second, first%second);
	}

}
