import java.util.Scanner;

public class Ex05_0506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5-5
		int a = 200;
		
		if(a<100) {
			System.out.printf("100���� �۱���.. \n");
			System.out.printf("���̸� �� ���嵵 ���̰���?\n");
		} else {
			System.out.printf("100���� ũ����..\n");
			System.out.printf("�����̸� �� ���嵵 ���̰���?\n");
		}
		System.out.printf("���α׷� ��! \n\n\n");
		
		
		
		//5-6
		Scanner s = new Scanner(System.in);
		int b;
		
		System.out.print("������ �Է��ϼ��� : ");
		b = s.nextInt();
		
		if(b%2==0) {
			System.out.printf("¦���� �Է��߱���! \n");
		} else {
			System.out.printf("Ȧ���� �Է��߱���! \n");
		}
	}

}
