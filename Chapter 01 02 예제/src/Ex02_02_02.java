import java.util.Scanner;

public class Ex02_02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �����ؼ� ���� ���� ���� ���� �� �� 
		int a, b, c, result;	
		Scanner s = new Scanner(System.in);
		System.out.print("ù��° ����� ���� �Է��ϼ���. ==> ");
		a = s.nextInt();
		System.out.print("<1>����,<2>����,<3>����,<4>������ �����Ͻÿ� ==> ");
		b = s.nextInt();
		if( b >= 5) {
			System.out.println("5 �̻��� �Է� �Ͻ� �� �����ϴ�.");
			System.out.println("�ٽ� �Է��� �ּ���.");
			System.out.print("<1>����,<2>����,<3>����,<4>������ �����Ͻÿ� ==> ");
			b = s.nextInt();
			}
		
		if( b <= 5) {
			System.out.print("�ι�° ����� ���� �Է��ϼ���. ==> ");
		}
			c = s.nextInt();

		
		if( b == 1 ) {
			result = a + b; //������ ��Ʈ �ٷ� �Ʒ��� ������ �ߴµ� �������� ���� ������ ������ �������� �ʰ� ���� ��
			System.out.println(a + "+" + c + "=" + result);
			}
		if( b == 2 ) {
			result = a - b;
			System.out.println(a + "-" + c + "=" + result);
			}
		if( b == 3 ) {
			result = a * b;
			System.out.println(a + "*" + c + "=" + result);
			}
		if( b == 4 ) { 
			result = a / b;
			System.out.println(a + "/" + c + "=" + result);
			}
	
	}

}
