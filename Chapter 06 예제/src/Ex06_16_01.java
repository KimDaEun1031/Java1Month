import java.util.Scanner;

public class Ex06_16_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.printf("글자를 입력하시오 : ");
		String ch = s.nextLine();
		
		
		System.out.printf("\n\n입력된 문자열 ==> %s\n",ch);
		System.out.printf("변환된 문자열 ==> ");
		int leng = ch.length();
		int str;
		
		for(str = leng-1;str>=0;str--) {
			System.out.printf("%c",ch.charAt(str));
		}

	}

}
