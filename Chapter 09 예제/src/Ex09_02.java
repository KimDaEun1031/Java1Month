import java.util.Scanner;

public class Ex09_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner s = new Scanner(System.in);
		System.out.printf("���ڿ� �Է� : ");
		str = s.nextLine();
		System.out.printf("��� ���ڿ� : ");
		for(int i = 0;i<str.length();++i) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
			if(str.charAt(i)=='s') {
				System.out.printf("%c",'$');
			}
			else {
				System.out.printf("%c",str.charAt(i));
			}
		}
	}

}
