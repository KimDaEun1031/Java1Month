import java.util.Scanner;

public class Ex02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		int result;
		                       //�Է� �ֿܼ� �Է��϶�� ��
		Scanner s = new Scanner(System.in);
		System.out.print("ù��° ����� ���� �Է��Ͻÿ� ==> ");
		a = s.nextInt();
		System.out.print("�ι�° ����� ���� �Է��Ͻÿ� ==> ");
		b = s.nextInt();
		
		result = a + b;
		System.out.println(a + "+" + b + "=" + result);
		
		result = a - b;
		System.out.println(a + "-" + b + "=" + result);
		
		result = a * b;
		System.out.println(a + "*" + b + "=" + result);
		
		result = a / b;
		System.out.println(a + "/" + b + "=" + result);
		
	}

}
