package test;

public class �ݺ���1 {
	public static void main(String[] args) {
		
		int sum = 0; //���� sum�� 0���� ����
		
		for(int i = 1; i <= 10; i++) { 
			//���� i�� 1�̰� i�� 10���� ũ�ų� ���ƾ��Ѵ�. �׸��� ����
			sum += i;
            //+= ���� ������ -=,*=,/=,%= �� �ְ� 
			//���� �ݴ��� =+ �̷� �Ŵ� ������ ���� �����ϸ� �� =+ 10 �� 10 =-�� -10
		}
		System.out.println("1���� 10������ ����" + sum + "�Դϴ�.");
	
	}

}
