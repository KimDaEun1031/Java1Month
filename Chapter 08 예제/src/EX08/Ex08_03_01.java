package EX08;

import java.util.Scanner;

public class Ex08_03_01 {
	public static void main (String [] args) {
		//선생님이 한거
		
		int [] inputs= new int[5];
		Scanner s = new Scanner(System.in);
		for(int i = 0; i<inputs.length;++i) {
			System.out.printf("%d 번째 숫자를 입력하세요 : ", i);
			inputs[i] = s.nextInt();
		}
		int total = 0;
		for(int i= 0;i<inputs.length;++i) {
			total += inputs[i];
		}
		
		System.out.println("합계는 ==> " + total);
		
		
		
		
	}

}
