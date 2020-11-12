import java.util.Scanner;

public class Ex04_09_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("## 교환할 돈은? ");
		int money = s.nextInt();
		
		int a;
		int b;
		int c;
		int d;
		
		a = money / 500;
		money = money % 500;
		
		b = money / 100;
		money = money % 100;
		
		c = money / 50;
		money = money % 50;
		
		d = money / 10;
		money = money % 10;
		
		System.out.printf("오백원짜리 ==> %d개",a);
		System.out.printf("\n백원짜리 ==>   %d개",b);
		System.out.printf("\n오십원짜리 ==> %d개",c);
		System.out.printf("\n십원짜리 ==>   %d개",d);
		System.out.printf("\n바꾸지 못한 잔돈 ==> %d원",money);
	}

}
