import java.util.Scanner;

public class Ex09_23_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		String str2[];
		
		System.out.printf("���ڿ��� �Է��Ͻÿ� : ");
		str = s.nextLine();
		str2 = str.split("");
		System.out.printf("�ٲ� ���ڿ� : ");
		
		for(int i=0;i<str.length();++i) {
			System.out.printf(str2[str.length()-1-i]);
		}
		
	}

}
