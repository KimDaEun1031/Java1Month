import java.util.Scanner;

public class Ex02_02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("ù��° ����� ���� �Է��Ͻÿ� ==> ");
		int a = s.nextInt();
		System.out.print("�ι�° ����� ���� �Է��Ͻÿ� ==> ");
		int b = s.nextInt();
		System.out.print("����° ����� ���� �Է��Ͻÿ� ==> ");
		int c = s.nextInt();
		System.out.print("�׹�° ����� ���� �Է��Ͻÿ� ==> ");
		int d = s.nextInt();
		
		int result = a + b - c * d;
		System.out.println(a + "+" + b + "-" + c + "*" + d + "=" + result );
		
		
	}

}
