package EX;

import java.util.Scanner;

public class Ex03_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a , b = 0;
		String str;
		Scanner s = new Scanner(System.in);
		System.out.print("�Է����� ���� <1>10 <2>16 <3>8 : ");
		a = s.nextInt();
		System.out.print("\n�� �Է� : ");
		
		
		if(a==1) {
			str = s.next();
			b = Integer.parseInt(str, 10);
		}
		else if(a==2) {
			str = s.next();
			b = Integer.parseInt(str, 16);
		}
		else if(a==3) {
			str = s.next();
			b = Integer.parseInt(str, 8);
		}
		System.out.printf("10����  ==> %d\n" , b);
		System.out.printf("16����  ==> %X\n" , b);
		System.out.printf("8����  ==>  %o" , b);
		
		

	}

}
