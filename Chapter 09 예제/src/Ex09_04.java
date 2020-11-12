import java.util.Scanner;

public class Ex09_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//indexOf(), lastIndexOf()
		String str;
		Scanner s = new Scanner(System.in);
		
		System.out.printf("문자열 입력 : ");
		str = s.nextLine();
		
		System.out.printf("제일 처음 나오는 java 위치 : ");
		System.out.println(str.indexOf("Java"));
		System.out.printf("제일 나중에 나오는 java 위치 : ");
		System.out.println(str.lastIndexOf("Java"));
		
	}

}
