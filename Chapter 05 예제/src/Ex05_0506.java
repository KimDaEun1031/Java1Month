import java.util.Scanner;

public class Ex05_0506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5-5
		int a = 200;
		
		if(a<100) {
			System.out.printf("100보다 작군요.. \n");
			System.out.printf("참이면 이 문장도 보이겠죠?\n");
		} else {
			System.out.printf("100보다 크군요..\n");
			System.out.printf("거짓이면 이 문장도 보이겠죠?\n");
		}
		System.out.printf("프로그램 끝! \n\n\n");
		
		
		
		//5-6
		Scanner s = new Scanner(System.in);
		int b;
		
		System.out.print("정수를 입력하세요 : ");
		b = s.nextInt();
		
		if(b%2==0) {
			System.out.printf("짝수를 입력했군요! \n");
		} else {
			System.out.printf("홀수를 입력했군요! \n");
		}
	}

}
