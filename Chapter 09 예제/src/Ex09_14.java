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
			System.out.printf("������ �Է� [1] + [2] - [3] * [4] / : ");
			oper = s.nextInt();
			System.out.print("ù��° ���� �Է� : ");
			x = s.nextInt();
			System.out.print("�ι�° ���� �Է� : ");
			y = s.nextInt();
			hap = clac(x,y,oper);
			System.out.printf("�� : %d\n",hap);
		} while(oper!=5);
	
	}

}
