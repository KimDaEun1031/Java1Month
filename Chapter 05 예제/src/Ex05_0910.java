import java.util.Scanner;

public class Ex05_0910 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5-9
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.printf("1 ~ 4 �߿� �����ϼ���! ");
		a = s.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("1�� �����ߴ�.");
			break;
		case 2:
			System.out.println("2�� �����ߴ�.");
			break;
		case 3:
			System.out.println("3�� �����ߴ�.");
			break;
		case 4:
			System.out.println("4�� �����ߴ�.");
			break;
		default :
			System.out.println("�̻��� �� �����ߴ�!");
		}
		
		
		//5-10
		int year;
		
		System.out.print("��������� �Է��ϼ��� : ");
		year = s.nextInt();
		
		switch (year % 12) {
		case 0 : System.out.println("�����̶�"); break;
		case 1 : System.out.println("�߶�"); break;
		case 2 : System.out.println("����"); break;
		case 3 : System.out.println("������"); break;
		case 4 : System.out.println("���"); break;
		case 5 : System.out.println("�Ҷ�"); break;
		case 6 : System.out.println("ȣ���̶�"); break;		
		case 7 : System.out.println("�䳢��"); break;
		case 8 : System.out.println("���"); break;
		case 9 : System.out.println("���"); break;
		case 10 : System.out.println("����"); break;
		case 11 : System.out.println("���"); break;
		
		}
		

	}

}
