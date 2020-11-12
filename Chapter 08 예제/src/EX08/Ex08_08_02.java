package EX08;

import java.util.Scanner;

public class Ex08_08_02 {//나중에 다시 연습하

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int [][] exams = new int[5][4]; //학생이 5명 시험이 4번
		for(int i = 0; i < exams.length; ++i) { //i는 변수 시험의 길이 총 5번 반복 첫번째 배열
			System.out.printf("%d 학생의 성적을 입력하세요..\n", i); //학생 0~4번에
			for(int j = 0; j < exams[i].length; ++j) {//두번째 배열 반복
				System.out.printf("%d 번째 시험 성적 : ", j);//시험 성적 4개 
				exams[i][j] = s.nextInt();
			}
		}
		
		for(int i = 0; i < exams.length; ++i) {
			System.out.printf("%d 학생 -----------------\n", i);//첫번째 배열 5번 반복
			int total = 0;
			for(int j = 0; j < exams[i].length; ++j) {
				System.out.printf("%d 번째 시험 : %d\t", j, exams[i][j]);
				total += exams[i][j];
			}
			System.out.printf("평균 : %d\n", total/exams[i].length);
		}
		
	}

}
