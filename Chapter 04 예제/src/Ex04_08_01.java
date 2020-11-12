import java.util.Scanner;

public class Ex04_08_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.printf("첫번째 계산할 값을 입력하세요 ==> ");
		float a = s.nextFloat();
		System.out.printf("두번째 계산할 값을 입력하세요 ==> ");
		float b = s.nextFloat();
		float result = (int)a % (int)b;

		System.out.printf("%.2f + %.2f = %.2f \n",a,b, a+b);
		System.out.printf("%.2f - %.2f = %.2f \n",a,b, a-b);
		System.out.printf("%.2f * %.2f = %.2f \n",a,b, a*b);
		System.out.printf("%.2f / %.2f = %.2f \n",a,b, a/b);
		
		System.out.printf("%d %% %d = %d",(int)a,(int)b,(int)result);
		
	}

}
