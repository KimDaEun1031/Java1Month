import java.util.Scanner;

public class Ex06_18 {
	//무한 루프
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		for( ; ; ) {
			System.out.printf("더할 첫번째 수 : ");
			int a = s.nextInt();
			System.out.printf("더할 두번째 수 : ");
			int b = s.nextInt();
			System.out.printf("%d + %d = %d\n",a,b,a+b);
			
		}
		
		

	}

}
