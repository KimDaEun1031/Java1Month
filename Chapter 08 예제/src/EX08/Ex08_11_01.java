package EX08;

import java.util.Scanner;

public class Ex08_11_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length;
		int car_number;
		char car_name = 'A';
		
		Scanner s = new Scanner(System.in);
		System.out.printf("�ڵ����� �� �ͳ��� ���̸� �Է��Ͻÿ�. : ");
		length = s.nextInt();
		System.out.printf("�� �ڵ����� ������ �Է��Ͻÿ�. : ");
		car_number = s.nextInt();
		
		char [] stack = new char [length];
		int top = stack.length;
		
		if(car_number==0) {
			System.out.printf("!����! �� �ڵ����� �����ϴ�.");
			System.out.printf("���α׷��� �����մϴ�.");
		}
		
		for(top=0;top<car_number;top++) {		
			if(car_number>=length) {
				System.out.printf("!����! �ڵ����� ���ĳ��ϴ�\n");
				System.out.printf("���α׷��� �����մϴ�.");
				break;
				} else {			
				System.out.printf("%c �ڵ����� ���ϴ�.\n",car_name);
				car_name++;
				}
			} 
		System.out.printf("\n�ͳ��� ���̴� %d�̰�, �� �ڵ����� ������ %d�Դϴ�.\n",length,top);
		System.out.printf("�����ִ� �ͳ��� ���̴� %d�Դϴ�\n\n",length-top);
	
	}
}
