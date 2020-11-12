import java.util.Scanner;

public class Ex09_24_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = "";
		String str2 = "";
		char ch;
		
		System.out.printf("문자열을 입력하시오 : ");
		str = s.nextLine();
		//str.toLowerCase() str.toUpperCase()
		for(int i = 0;i<str.length();i++) {
			ch = str.charAt(i);
			if((65 <= ch) && (ch <= 90)) { // 아스키코드를 이용 대문자
				str2 += str.valueOf(ch).toLowerCase(); //내장 함수를 이용해서 만든거 
				           //valueof는 형 변환 함수 느낌 
			}
			else if((97 <= ch) && (ch <= 122)) { //그냥 이프는 안됨 // 소문자
				str2 += str.valueOf(ch).toUpperCase();
			}
			else // 나머지 문자
				str2 += (char) ch;
			
		}
		System.out.print("변환된 문자열 : "+str2);
		
	}

}
