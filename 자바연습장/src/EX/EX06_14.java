package EX;

public class EX06_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ �����(����)
		//9�� �ݺ��� �� 9�� �ݺ��ǰ�
		
		int a, b;
		
		for(a=1;a<=9;a++) {
			for(b=1;b<=9;b++) {
				System.out.printf("%d X %d = %d \t", b, a, a*b);
				                             //\t ��ſ� \n�� ������ �����ٷ� ����
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		

		//�Ųٷ� �����
		for(a=9;a>=1;a--) {
			for(b=1;b<=9;b++) {
				System.out.printf("%d X %d = %d \t", b, a, a*b);
				                             //\t ��ſ� \n�� ������ �����ٷ� ����
			}
			System.out.println();
		}
	}

}
