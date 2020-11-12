import java.util.Scanner;

public class Ex09_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//replace(), substring(), split()
		String str;
		Scanner s = new Scanner(System.in);
		
		System.out.printf("문자열 입력 : ");
		str = s.nextLine();
		
		String str2 = str.replace("Java","자바");
		System.out.printf("replace 1. %s\n",str2);
		String str3 = str.substring(0,4);
		//0부터 4개까지 그래서 Java라고 치면 Java전체가 나옴 
		//앞에는 몇부터 셀꺼냐 콤마 친 뒤는 총 몇개까지 셀꺼냐
		//0부터 시작해도 0123이아님
		System.out.printf("substring 2. %s\n",str3);
		String [] str4 = str.split(" ");
		for(int i = 0;i<str4.length;++i) {
			System.out.printf("split 3. %s\n",str4[i]);
		}
		
	}

}
