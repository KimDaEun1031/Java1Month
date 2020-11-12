import java.util.Scanner;

public class Ex05_12_01 {
	//중복if문을 활용하여 두수의 연산을 수행하는 프로그램을 작성해보자
	public static void main (String [] args) {
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
			System.out.printf("%d / %d = %.1f \n", first, second, first/second);
		if (op=='%')
			System.out.printf("%d %% %d = %.1f \n", first, second, first%second);
		else
			System.out.println("연산자를 잘못입력했습니다.");

	}

}
