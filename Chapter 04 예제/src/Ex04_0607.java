
public class Ex04_0607 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 99;
		boolean result = (a >= 100) && (a <= 200);
		         System.out.println(result);
		
		result = (a >= 100) || (a <= 200);
		System.out.println(result);
		
		result = !(a == 100);
		System.out.println(result);
		
		
		int x = 3;
		int y = 4;
		
		int max = x>y?++x:++y;//���꿡 ���������� ������� ������ ���� �������� ����
		                      //���ǽ� ? �� : �罺 
								// ���� ���ǽ��� Ʋ���� �罺 ���� �����ϸ� ���� ���� ������� ������
		                      // ó�� ������ ���� �״�� ������ ����
		System.out.printf("max = %d, x = %d, y = %d ",y,x,y);
		
		
		//4-7����
		int num1 = 100;
		int num2 = -200;
		
		boolean fin = (num1 != 0);
		boolean fin1 = (num2 != 0);
		
		System.out.printf("\n\n����� AND ���� : %s \n",fin && fin1);
		System.out.printf("����� OR ���� : %s \n",fin || fin1);
		System.out.printf("����� NOT ���� : %s \n", !fin);
		
		//4-6����
		a = 99;
		System.out.printf("\n\nAND ���� : %s \n", (a>=100) && (a<=200));
		System.out.printf("OR ���� : %s \n", (a>=100) || (a<=200));
		System.out.printf("NOT ���� : %s \n", !(a==100));
	}
	
	

}
