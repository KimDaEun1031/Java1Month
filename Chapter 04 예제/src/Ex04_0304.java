
public class Ex04_0304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		a++;
		System.out.println(a);
		a--;
		System.out.println(a);
		a += 5; //=+ ó�� ���� ���� + �� - �� ���ڱ�ȣ�� �з���
		        // +5�� -5ó�� ��
		System.out.println(a);
		System.out.println();
		
		int i1 = 10;
		int i2 = 10;
		int r1 = 2 * ++i1; //�����ϰ� ���ϱ��
		int r2 = 2 * i2++; //���ϱ��ϰ� �����ϰ� �� �Ŀ� i2�� ����
		                   // �� i2*2�� ���� �ϰ� �׷� 20����? �¸� r2�� �����ϰ� �� �� �������� �ߵ�
		                   //�׷��� i2�� 11�� ��
		
		System.out.printf("i1 = %d, i2 = %d, r1 = %d ,r2 = %d", i1 , i2 , r1 , r2);
		System.out.println();
		System.out.println();
		
		//���쾾�� ���������� �����϶�� �� ����
		a = 10;
	      System.out.println(a++);
	      System.out.println(a);
	      
	      int b = 10;
	            System.out.println(++b);
	      System.out.println(b);
		
	    //4-4����
	      a = 10;
	     
	      
	      b = a++;
	      System.out.printf("\n%d \n", b );
	      
	      b = ++a;
	      System.out.printf("%d \n", b);
		
		
	}

}
