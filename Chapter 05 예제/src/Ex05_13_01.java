import java.util.Scanner;

public class Ex05_13_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch case
		Scanner s = new Scanner(System.in);
		int first, second;
		char op;
		String [] str;
		
		System.out.printf("������ ���ٷ� ����� �Է��ϼ���. : ");
		str = s.nextLine().split(" ");
		
		first = Integer.parseInt(str[0]);
		op = str[1].charAt(0);
		second = Integer.parseInt(str[2]);
		
		switch (op) {
		case '+' :
			System.out.printf("%d + %d = %d \n", first, second, first+second);
			break;
		case '-' :
			System.out.printf("%d - %d = %d \n", first, second, first-second);
			break;
		case '*' :
			System.out.printf("%d * %d = %d \n", first, second, first*second);
			break;
		case '/' :
			System.out.printf("%d / %d = %d \n", first, second, first/second);
			break;
		case '%' :
			System.out.printf("%d %% %d = %d \n", first, second, first%second);
			break;
		default :
			System.out.println("�����ڸ� �߸��Է��߽��ϴ�.");
		}
		

	}

}
