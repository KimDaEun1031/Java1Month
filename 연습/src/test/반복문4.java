package test;

public class �ݺ���4 {

	public static void main(String[] args) //throws java.lang.Exception ���� ������ ��µ� ��?
	{                                    // ���� ���ܸ� ���� �ʾƵ� �� ������ ��
		// ����ġ�� ���� �����ϴ� �� ���� ���� �� ����
		int h = 1; 
		// n ���� ���� �� 
		int n = 1; 
		// �� ��: [1]+[2]+[4]+[7]+[11]+[16]+[22] 
		int k = 0; 
		// ����ġ: 1 2 3 4 5 6 
		do{ k+=1; 
		    n += k; 
		if(n > 100) break; // n�� 100�̻��̸� �������´�
		    h += n;
		// (����) 
		System.out.printf("%d - %d - %d\n",n,k,h); 
		
		}while(true);//���ѷ����� ������ ���� �ݺ���


	}

}
