package EX;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Input name : ");
		String name = s.nextLine();
		System.out.print("kor : ");
		int kor = s.nextInt();
		System.out.print("eng : ");
		int eng = s.nextInt();
		System.out.print("mat : ");
		int mat = s.nextInt();
		
		System.out.println();
		System.out.printf("이름 : %s\n" , name);
		System.out.println("합계점수 : " +(kor+eng+mat));
		System.out.printf("평균점수 : %.1f" , (float)(kor+eng+mat)/3);
		
		
	}

}
