
public class Ex06_1415 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,k;
		for(i=1;i<=9;i++) {
			for(k=1;k<=9;k++) {
				System.out.printf("%d X %d = %d\t",k,i,k*i);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		for(i=1;i<=9;i++) {
			for(k=1;k<=9;k++) {
				System.out.printf("%3d X %d = %2d",k,i,k*i);
				//%�� 3d���̿� ���ڳ� ���ڸ� �־�� ������ �󸶳� �������� �� �� ����
				//������� 2d�� �Ǿ��ִµ� 1d�� �غ��� ������ ��������.
				//�� 1d�� d�� �����Ű� 2���� ���� �Ǿ 3d�� 2ĭ ����
				//2d�� 1ĭ ������ ����� �Ŵ�.
			}
			System.out.println();
		}
		
		
		
		

	}

}
