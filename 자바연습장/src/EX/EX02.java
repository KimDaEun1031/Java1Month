package EX;

public class EX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//65430���� ����� ���� ȭ���� ������ ���Ͻÿ�
		int money = 65430;
		
		int a = money / 10000;
		money = money % 10000;
		
		int b = money / 1000;
		money = money % 1000;
		
		int c = money / 100;
		money = money % 100;
		
		int d = money / 10;
		money = money % 10;
		
		
		System.out.println("���� =" + a);
		System.out.println("õ�� =" + b);
		System.out.println("��� =" + c);
		System.out.println("�ʿ� =" + d);
	}

}
