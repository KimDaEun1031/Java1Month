import java.util.Scanner;

public class Ex09_23_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		String str2[];
		
		System.out.printf("문자열을 입력하시오 : ");
		str = s.nextLine();
		str2 = str.split("");
		System.out.printf("바뀐 문자열 : ");
		
		for(int i=0;i<str.length();++i) {
			System.out.printf(str2[str.length()-1-i]);
		}
		
	}

}
