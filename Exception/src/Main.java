import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList��� �͵� ����
		//������ �迭

		ArrayList<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		for(int i = 0; i < 10; ++i)
			list.add("List"+i);
//		
//		list.remove(1); //����Ʈ�� �迭�� ù��° ������ �����. ���� Two
//		list.remove("Three"); //Three�� �Էµ� ����Ʈ�� �����
		for(String s : list)
			System.out.println(s); //= ���⼭ ����Ʈ ���
//		
		int size = list.size();
		System.out.println("Size : " + size); //���� list�迭�� ����� ��� ���� 3���� ���� 10���� ���ļ� 13��
//		
		String [] arrs = new String[list.size()]; //arrs�� ���̴� list�������̴�.
		arrs = list.toArray(arrs);//list�迭�� �Ϲ� �迭�� �ٲ۰��̴�.
		for(String s : arrs)
			System.out.println(s);
//		
		Iterator<String> iter = list.iterator(); //
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
//		
		
	}

}
