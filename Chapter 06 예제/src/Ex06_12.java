import java.util.Scanner;

public class Ex06_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i;
		int dan;
		
		System.out.print("�� ��?");
		dan = s.nextInt();
	
		for(i=1;i<=9;i++) {
			System.out.printf("%d X %d = %d \n",dan, i, dan*i); }
		
		System.out.println();
		
		//�Ųٷ� ����غ���.
		for(i=9;i>=1;i--) {
			System.out.printf("%d X %d = %d \n",dan, i, dan*i); }
	}

}
