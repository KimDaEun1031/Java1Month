import java.util.Scanner;

public class Ex07_17_01 {
	//�Է��� �� �� ������ �հ踦 ���ϵ� ���ϴ� ����� �����Ͽ� �հ踦 ���ϴ� ���α׷�

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int first;
		int fin;
		int num;
		int result=0;
		
		System.out.printf("�հ��� ���۰�(������ ����) : ");
		first = s.nextInt();
		System.out.printf("�հ��� ����(������ ŭ) : ");
		fin = s.nextInt();
		System.out.printf("��� : ");
		num = s.nextInt();
		
		int i = first;
		while(i<=fin) {
			i++;
			if(i%num==0) {
				result += i;
			}
		}
		System.out.printf("%d���� %d������ %d����� �� : %d",first,fin,num,result);
		

	}

}
