import java.util.Scanner;

public class Ex09_24_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = "";
		String str2 = "";
		char ch;
		
		System.out.printf("���ڿ��� �Է��Ͻÿ� : ");
		str = s.nextLine();
		//str.toLowerCase() str.toUpperCase()
		for(int i = 0;i<str.length();i++) {
			ch = str.charAt(i);
			if((65 <= ch) && (ch <= 90)) { // �ƽ�Ű�ڵ带 �̿� �빮��
				str2 += str.valueOf(ch).toLowerCase(); //���� �Լ��� �̿��ؼ� ����� 
				           //valueof�� �� ��ȯ �Լ� ���� 
			}
			else if((97 <= ch) && (ch <= 122)) { //�׳� ������ �ȵ� // �ҹ���
				str2 += str.valueOf(ch).toUpperCase();
			}
			else // ������ ����
				str2 += (char) ch;
			
		}
		System.out.print("��ȯ�� ���ڿ� : "+str2);
		
	}

}
