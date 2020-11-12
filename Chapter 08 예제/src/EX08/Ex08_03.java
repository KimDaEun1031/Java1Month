package EX08;

import java.util.Scanner;

public class Ex08_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int [] aa = new int[4];
		int result = 0;
		int i;
		
		for(i = 0;i<=3;i++) {
			System.out.printf("%d번째 숫자를 입력하세요!", i + 1);
			aa[i] = s.nextInt();
		}
		
		result += aa[0] + aa[1] + aa[2] + aa[3];
		
		System.out.println("합계는 : " + result);
		
	}

}
