import java.util.Scanner;

public class Ex05_12_01 {
	//�ߺ�if���� Ȱ���Ͽ� �μ��� ������ �����ϴ� ���α׷��� �ۼ��غ���
	public static void main (String [] args) {
		Scanner s = new Scanner(System.in);
		int first, second;
		char op;
		
		System.out.printf("ù��° ���� �Է��ϼ��� : ");
		first = s.nextInt();
		
		System.out.printf("����� �����ڸ� �Է��ϼ��� : ");
		op = s.next().charAt(0);
		
		System.out.printf("�ι�° ���� �Է��ϼ��� : ");
		second = s.nextInt();
		
		if (op=='+')
			System.out.printf("%d + %d = %d \n", first, second, first+second);
		if (op=='-')
			System.out.printf("%d - %d = %d \n", first, second, first-second);
		if (op=='*')
			System.out.printf("%d * %d = %d \n", first, second, first*second);
		if (op=='/')
			System.out.printf("%d / %d = %.1f \n", first, second, first/second);
		if (op=='%')
			System.out.printf("%d %% %d = %.1f \n", first, second, first%second);
		else
			System.out.println("�����ڸ� �߸��Է��߽��ϴ�.");

	}

}
