import java.util.Scanner;

public class Ex09_14 {
	
	static int clac(int a,int b,int op) {
		int result;
		
		switch(op) {
		case 1 : result = a + b; break;
		case 2 : result = a - b; break;
		case 3 : result = a * b; break;
		case 4 : result = a / b; break;
		default : result = 0; break;
		
		}
		
		return result;
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap;
		Scanner s = new Scanner(System.in);
		int oper,x,y;
		do {
			System.out.printf("연산자 입력 [1] + [2] - [3] * [4] / : ");
			oper = s.nextInt();
			System.out.print("첫번째 숫자 입력 : ");
			x = s.nextInt();
			System.out.print("두번째 숫자 입력 : ");
			y = s.nextInt();
			hap = clac(x,y,oper);
			System.out.printf("합 : %d\n",hap);
		} while(oper!=5);
	
	}

}
