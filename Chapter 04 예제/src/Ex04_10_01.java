import java.util.Scanner;

public class Ex04_10_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int year = s.nextInt();
		
		int a = year%4;
		int b = year%400;
		int c = year%100;
		
		if(a==0) {
			System.out.printf("%d���� �����Դϴ�.",year);
		}
		else if(b==0) {
			System.out.printf("%d���� �����Դϴ�.",year);
		}
		else if(c!=0) {
			System.out.printf("%d���� ������ �ƴմϴ�.",year);
			
		}
		
		//å ������ ���� Ȱ���ؼ� �϶��� ���������� ��¥����..
		if(((year%4==0) && (year%100!=0) || (year%400==0))) {
			System.out.printf("\n\n%d���� �����Դϴ�", year);
		}
		else {
			System.out.printf("%d���� ������ �ƴմϴ�.",year);
		}
		
	}

}
