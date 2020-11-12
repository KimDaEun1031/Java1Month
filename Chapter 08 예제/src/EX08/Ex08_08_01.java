package EX08;

import java.util.Scanner;

public class Ex08_08_01 {//영우씨가 하지 않았던 시험 수를 만들어봄

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int studentNumber;
		 int examnumber;
	      int total=0;
	      Scanner sc = new Scanner(System.in);
	      System.out.print("학생의 수를 입력하시오 : ");
	      studentNumber = sc.nextInt();
	      System.out.print("치룰 시험의 수를 입력하시오 : ");
	      examnumber = sc.nextInt();
	      int[][] exams = new int[studentNumber][examnumber];
	      
	      
	      
	      for(int i = 0; i < exams.length; i++) {
	    	  System.out.printf("-------------\n");
	    	  System.out.printf("   %d번째 학생 \n", i);
	    	  System.out.printf("-------------\n");
	         for(int j = 0; j < exams[i].length; j++) {
	            System.out.printf("%d번째 시험 성적 입력 : ", j+1);
	            exams [i][j] = sc.nextInt();
	            
	         }
	      }
	      for(int i = 0; i < exams.length; i++) {
	         System.out.printf("\n%d번째 학생의 성적--------------------------\n\n", i + 1);
	         for(int j = 0; j < exams[i].length; j++) {
	        	 System.out.printf("%d번째 시험\t", j + 1);
	        	 
	         }
	         System.out.printf("  평균\t");
	         System.out.println();
	         for(int j = 0; j < exams[i].length; j++) {
	            System.out.printf("%3d\t", exams[i][j]);
	            total += exams[i][j];
	         }	      
	         System.out.printf("%3d\t", total/exams[i].length);
	         total =0;
	         System.out.println();
	   }


	}

}
