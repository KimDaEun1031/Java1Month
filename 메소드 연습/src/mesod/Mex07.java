package mesod;

public class Mex07 {

	public static void main(String[] args) {
		// stringbuffer Ŭ������ Ȱ���Ͽ� ���ڿ� ó���ϱ�
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb + ": " + sb.hashCode());
		
		sb.append(" is apple.");//����� ��� concat
		System.out.println(sb + ": " + sb.hashCode());
		// + �����ڴ� ���ڿ��� stringbuilder�� ��ȯ �� append�� ���ڿ��� ���ϰ� tostring�Լ��� ��ȯ
		//���ڿ��� ������ ���ϸ� append�� ���� ���ڿ� 2���� ��ġ�� concat�� ����
		
		sb.insert(7," my");
		System.out.println(sb + ": " + sb.hashCode());
		
		sb.replace(8, 10," your");
		System.out.println(sb + ": " + sb.hashCode());
		
		sb.delete(8,13).insert(7," an");
		System.out.println(sb + ": " + sb.hashCode());		
	}

}
