package test;

public class �ݺ���2 {

	public static void main(String[] args) {
			 
		int [] kors = new int[5]; //�迭
		//int [] �ڷ��� �迭�̶�� �� kors�� ����
		// new�� ������ ���߿� ����
		// int[5]�� �ڷ���[ũ��]�̴�. �ڹٴ� 0���� ��
		
		kors[0] = 100; //�ڷ��� kors 0���� 100�̶�� ��?
		kors[1] = 90; 
		kors[2] = 77; 
		kors[3] = 23; 
		kors[4] = 88; 
		      // �ڷ��� : �迭
		for (int kor : kors) { 
			System.out.println(kor);      
		// + kor + �κ��� kors[0]���� �ٲ� ���� ���� �� 5�� ���� ��?
			//�ֳĸ� �����ϴ� ũ�Ⱑ 5�ϱ� 5���� ������ �ִٴ� �� �׷��ϱ� �ϳ��� ������ �װŸ� 5�� �� ������ ��
		}

	}

}
