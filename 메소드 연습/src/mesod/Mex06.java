package mesod;

public class Mex06 {

	public static void main(String[] args) {
		// ���ڿ� ���� �� �ν��Ͻ� ����
		
		String a = "a";
		String b = "b";
		String c = "c";
		
		c = a+b;
		System.out.println(c);
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode()); //c�� ���� ū ������ ������ a�� b�� ���Ʊ⿡
		//a,b,c�� �ּҰ��� 10������ ���

	}

}
