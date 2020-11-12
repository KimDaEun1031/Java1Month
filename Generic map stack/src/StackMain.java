
public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IStack<Integer> si = new Stack<Integer>(5);// Ÿ���� int��
		//������ ������ ���ϴ°� [size]�� �Ұ�ȣ���� ���� 5�����
		//v = (T[])new Object[size]; = t �迭 v�� 5����� ��
		//�׸��� ��� Ǫ���ؼ� 0,1,2,3,4�� ����
		//v[count++] = o;
		//�׸��� ������ ���� �������� �� �ϳ��� ���� ���� ��Ÿ����� ��
		//return v[--count];
		//�׷��� 3�� ���� ����
   		
		si.push(10); //ù��°
		si.push(100); //�ι�°
		si.push(1000); //����°
		
		System.out.println(si.size());//�𸣰���
		int ret = si.pop();
		System.out.println(ret); //���� si.push ���� �������� �� �ͺ��� ����
		ret = si.pop();
		System.out.println(ret); 
		ret = si.pop();
		System.out.println(ret); //���� ó���� �� ���� ����
		//��� pop�� �༭ �׷� pop�� ������ �Ŵϱ� �� �� �� �� ���� ������ ��ó�� �Ǵ� ����
		
		IStack<Character> sc = new Stack<Character>(5); 
		sc.push('c');// char�� Ÿ�� ���ÿ� ����c�� ��
		char ch = sc.pop(); //char �� ���� ch�� ���ÿ��� �� ���� ������
		System.out.println(ch); //���� �߱⿡ ch�� ���� ���°���
		
		Point p1 = new Point(10, 20); //(x,y)���� 10,20
		IStack<Point> sp = new Stack<Point>(5);
		sp.push(p1);//10, 20�� �ѹ��� �� 
		Point p = sp.pop();
		System.out.printf("%d, %d\n", p.getX(), p.getY());//���� �Ȱ����� ������
	
		IStack<Integer> si2 = new Stack<Integer>(5);
		si2.push(20);
		
		System.out.printf("si = %d, si2 = %d\n", si.size(), si2.size());//���� �ȿ� �� ���� ������ �̾߱���
		// si�� ���� 10,100,1000�̴ϱ� 3�� ������ si2�� 20 �ϳ��ϱ� 1�� ����
		boolean b = si.compareSize(si2);
		//si�� si2���� ū ���� ������ �ִٸ� true si2�� ������ ������ ���� si�� 3�̴ϱ� 4�̸� false���� ����
		System.out.println(b);
		System.out.printf("si = %d, sp = %d\n", si.size(), sp.size());
		b = si.compareSize(sp);
		System.out.println(b);
	}

}
