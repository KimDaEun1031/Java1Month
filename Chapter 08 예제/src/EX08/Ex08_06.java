package EX08;

public class Ex08_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aa[] = {10,20,30,40,50};
		int count;
		int size;
		
		
		count = aa.length;
		size = count*Integer.BYTES;
		

		System.out.printf("�迭 aa[]�� ����� ������ %d�� �Դϴ�.\n",count);
		System.out.printf("�迭 aa[]�� ����� ��ü ũ��� %d ����Ʈ �Դϴ�.\n",size);
		
		//8-3 ���� Ǯ���
		//���� �����Ͽ� �迭 aa�� ����ִ� ��ü ���� ���� ����ϴ� ���α׷��� �ۼ��غ���
		//for(i=0;i<count;i++) Ȱ��
		int result = 0;
		
		for(int i=0;i<count;i++) {
			result += aa[i];
		}
		System.out.println(result);
	}

}
