
public class Ex04_080910 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4-8 ����
		//��Ʈ ���� ��� 1 1 �� Ʈ�� �������� �罺
		System.out.printf("10 & 7 = %d \n", 10&7);
		System.out.printf("123 & 456 = %d \n", 123&456);
		System.out.printf("0xFFFF & 0000 = %d \n", 0xFFFF & 0000);
		//16���� ffff�� 1�� �ְ� 0000�� 0�� �ֱ⿡ ������ ����ϸ� �̷��� �ȴ�.
		// 1111 1111 1111 1111
		// 0000 0000 0000 0000
		//--------------------- <- 0�� 1�� �ֱ⿡ ������ �罺 �׷��� 0�� ���´�.
		// 0000 0000 0000 0000
		
		//4-9����
		//��Ʈ ���� ��� 0 0�� �罺 �������� Ʈ��
		System.out.printf("\n10 | 7 = %d \n", 10|7);
		System.out.printf("123 | 456 = %d \n", 123|456);
		System.out.printf("10������ ����� 0xFFFF | 0000 = %d \n", 0xFFFF | 0000);
		System.out.printf("16������ ����� 0xFFFF | 0000 = %x \n", 0xFFFF | 0000);
		
		//4-10����
		//��Ʈ ��Ÿ�� ���� ������ 1 0 0 1�� Ʈ�� ���� �� �罺 
		System.out.printf("\n10 ^ 7 = %d \n", 10^7);
		System.out.printf("123 ^ 456 = %d \n", 123^456);
		System.out.printf("10������ ����� 0xFFFF ^ 0000 = %d \n", 0xFFFF ^ 0000);
		System.out.printf("16������ ����� 0xFFFF ^ 0000 = %x \n", 0xFFFF ^ 0000);
		// ^ = 6���� ����
		
		
		
		//
	}

}
