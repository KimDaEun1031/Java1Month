package EX08;

import java.util.Scanner;

public class Ex08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int [] aa = new int[4];
		int result;
		
		System.out.printf("ù��° ���ڸ� �Է��ϼ���. : ");
		aa[0] = s.nextInt();
		System.out.printf("�ι�° ���ڸ� �Է��ϼ���. : ");
		aa[1] = s.nextInt();
		System.out.printf("����° ���ڸ� �Է��ϼ���. : ");
		aa[2] = s.nextInt();
		System.out.printf("�׹�° ���ڸ� �Է��ϼ���. : ");
		aa[3] = s.nextInt();
		
		result = aa[0] + aa[1] + aa[2] + aa[3];
		
		System.out.println("�հ� ==>  " + result);

	}

}
