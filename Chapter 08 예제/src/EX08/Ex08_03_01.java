package EX08;

import java.util.Scanner;

public class Ex08_03_01 {
	public static void main (String [] args) {
		//�������� �Ѱ�
		
		int [] inputs= new int[5];
		Scanner s = new Scanner(System.in);
		for(int i = 0; i<inputs.length;++i) {
			System.out.printf("%d ��° ���ڸ� �Է��ϼ��� : ", i);
			inputs[i] = s.nextInt();
		}
		int total = 0;
		for(int i= 0;i<inputs.length;++i) {
			total += inputs[i];
		}
		
		System.out.println("�հ�� ==> " + total);
		
		
		
		
	}

}
