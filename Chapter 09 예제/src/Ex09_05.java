import java.util.Scanner;

public class Ex09_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//replace(), substring(), split()
		String str;
		Scanner s = new Scanner(System.in);
		
		System.out.printf("���ڿ� �Է� : ");
		str = s.nextLine();
		
		String str2 = str.replace("Java","�ڹ�");
		System.out.printf("replace 1. %s\n",str2);
		String str3 = str.substring(0,4);
		//0���� 4������ �׷��� Java��� ġ�� Java��ü�� ���� 
		//�տ��� ����� ������ �޸� ģ �ڴ� �� ����� ������
		//0���� �����ص� 0123�̾ƴ�
		System.out.printf("substring 2. %s\n",str3);
		String [] str4 = str.split(" ");
		for(int i = 0;i<str4.length;++i) {
			System.out.printf("split 3. %s\n",str4[i]);
		}
		
	}

}
