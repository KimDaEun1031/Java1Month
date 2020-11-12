import java.util.Scanner;

public class Ex09_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//compareTo(),contains()
		String str;
		String str2;
		Scanner s = new Scanner(System.in);
		
		System.out.printf("첫번째 문자열 입력 : ");
		str = s.nextLine();
		System.out.printf("두번째 문자열 입력 : ");
		str2 = s.nextLine();
		
		System.out.println(str.compareTo(str2)); //두 문자열의 비교값을 출력 str - str2
		System.out.println(str.contains("Java")); //()안에 ""를 하고 단어를 넣으면 str 값 안에 그 단어가 있냐고 물어보는 거
		                                          //str2라고 집어넣으면 str과 str2가 같냐? 라고 물어보는 거
		                                          //boolean이기에 참과 거짓으로 구분함
		
		
		
		
	}

}
