import java.util.Scanner;

public class Ex09_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//compareTo(),contains()
		String str;
		String str2;
		Scanner s = new Scanner(System.in);
		
		System.out.printf("ù��° ���ڿ� �Է� : ");
		str = s.nextLine();
		System.out.printf("�ι�° ���ڿ� �Է� : ");
		str2 = s.nextLine();
		
		System.out.println(str.compareTo(str2)); //�� ���ڿ��� �񱳰��� ��� str - str2
		System.out.println(str.contains("Java")); //()�ȿ� ""�� �ϰ� �ܾ ������ str �� �ȿ� �� �ܾ �ֳİ� ����� ��
		                                          //str2��� ��������� str�� str2�� ����? ��� ����� ��
		                                          //boolean�̱⿡ ���� �������� ������
		
		
		
		
	}

}
