import java.util.Scanner;

public class Ex09_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner s = new Scanner(System.in);
		System.out.printf("문자열 입력 : ");
		str = s.nextLine();
		System.out.printf("출력 문자열 : ");
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
