
public class Ex04_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��Ʈ ���꿡 ����ũ�� ����ϴ�  ����
		//����ũ(mask)�� ������ �ɷ��ִ� ������ �Ѵ�.
		byte a = 'A', b;
		byte mask = 0x0F; //����ũ �� (0000 1111)�� �����Ѵ�.
		
		System.out.printf("%X & %X = %X \n", a, mask, a & mask);
		System.out.printf("%X |	%X = %X \n", a, mask, a | mask);//a�� mask�� ���� ���� ����
		
		mask = 'a' - 'A'; //a�� A�� ���̴� 32�̴�.
		
		b = (byte)(a ^ mask);
		System.out.printf("%c ^ %d = %c \n", a, mask, b);//A�� mask�� ��Ÿ�� ���� ����
		a = (byte)(b ^ mask);
		System.out.printf("%c ^ %d = %c \n", b, mask, a);//a�� mask�� ��Ÿ�� ���� ����
	}

}
