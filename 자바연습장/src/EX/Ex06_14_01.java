package EX;

public class Ex06_14_01 {
	//�����ܰ� ������ ���� ���

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b,c;
		
		for(c=1;c<=9;c++) {
			System.out.printf("  #��%d��# \t", c);
		}
		
		System.out.println();
		System.out.println();
		
		for(a=1;a<=9;a++) {
			for(b=1;b<=9;b++) {
				//if(a==1) {
					//System.out.printf("  #��%d��# \t",a);
				//} �̰� �ǰ� �ϰ� �ʹ�
				System.out.printf("%d X %d = %d \t", b ,a ,a*b);
			}
			System.out.println();
		}

	}

}
