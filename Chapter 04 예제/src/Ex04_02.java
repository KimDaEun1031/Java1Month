
public class Ex04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 3;
		int c = 4;
		
		int result1;
		int mok;
		int namugi;
		float result2;
		
		result1 = a + b - c;
		System.out.printf("%d + %d - %d = %d \n", a , b, c, result1 );
		
		result1 = a + b + c;
		System.out.printf("%d + %d + %d = %d \n", a , b, c, result1 );
		
		result2 = a + b / (float)c;
		System.out.printf("%d + %d / %d = %f \n", a , b, c, result2);
		//4-1�������� ��� ���� �� ��ȯ�� ���� 4-2�������� ���� �ſ���.
		//���� �� ��ȯ�� ���� �ʴ´ٸ� ���� ����+����/������ �Ǿ� 2�� ����
		//��� ���� float���� �ٲپ 2.0�� �� �� 
		//������ ���� ����ȯ�� �Ѵٸ� (float)�� �־ ����ȯ
		//���� �ֿܼ��� ���� �� ó�� �ȴ�. 2.750000
		//�ݴ�� �Ǽ�+�Ǽ� ���� ���� (int)�� �Ἥ ������ �� ��ȯ�� ��Ų��
		//�̷��� ���� �� ��ȯ ���ִ�(int)��  (float)�� (cast) �����ڶ�� �Ѵ�. �߿�
		mok = c / b;
		System.out.printf("%d / %d = %d \n", c, b, mok);
		
		namugi = c % b;
		System.out.printf("%d %% %d = %d \n\n", c, b, namugi); // %% �� �̷��� ������ ����? �𸣸� ���� ����
		
		//��ȣ�� ����� �켱����
		//���� ������ ���� ���� �� ���� �켱������ ���Ǵ� ���� ������ �������̴�.
		// ������ ��ȣ �ȿ� ���� Ȥ�� ������ ����ְ� �� �� ������ ���������� ���ȴٸ�
		// �̷� ������ ���� ���ð��̴�.
		
		// ������ ���� �������� ��ȣ�� �־�ڴ�.
		
		result1 = (a + b) - c;
		System.out.printf("(%d + %d) - %d = %d \n", a , b, c, result1 );
		
		result1 = a + (b + c);
		System.out.printf("%d + (%d + %d) = %d \n", a , b, c, result1 );
		
		//������ ������ �ִ� �Ŀ��� ��ȣ�� �ᵵ ���� ������ �ʴ� ���� �˾Ҵ�. 
		
		result2 = (a + b) / (float)c;
		System.out.printf("(%d + %d) / %d = %f \n", a , b, c, result2);
		
		//������ ���ϱ�� �������� ������ �Ŀ� ���ϱ⿡ ��ȣ�� ���� ���������� �켱������ ���ǰ� �����
		// ���� �޶�����
		
		mok = c / b;
		System.out.printf("%d / %d = %d \n", c, b, mok);
		
		namugi = c % b;
		System.out.printf("%d %% %d = %d \n", c, b, namugi);
		
		//���⼭ �˼� �ִ� ��!
		//��ȣ, ����, ����, ������, ������ � �� ���� �켱 ���ǳ�
		// ��ȣ, ������ ������, ������ ���� ������ �켱 ��� �ȴ�.

	}

}
