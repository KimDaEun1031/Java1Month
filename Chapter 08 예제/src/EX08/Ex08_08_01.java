package EX08;

import java.util.Scanner;

public class Ex08_08_01 {//���쾾�� ���� �ʾҴ� ���� ���� ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int studentNumber;
		 int examnumber;
	      int total=0;
	      Scanner sc = new Scanner(System.in);
	      System.out.print("�л��� ���� �Է��Ͻÿ� : ");
	      studentNumber = sc.nextInt();
	      System.out.print("ġ�� ������ ���� �Է��Ͻÿ� : ");
	      examnumber = sc.nextInt();
	      int[][] exams = new int[studentNumber][examnumber];
	      
	      
	      
	      for(int i = 0; i < exams.length; i++) {
	    	  System.out.printf("-------------\n");
	    	  System.out.printf("   %d��° �л� \n", i);
	    	  System.out.printf("-------------\n");
	         for(int j = 0; j < exams[i].length; j++) {
	            System.out.printf("%d��° ���� ���� �Է� : ", j+1);
	            exams [i][j] = sc.nextInt();
	            
	         }
	      }
	      for(int i = 0; i < exams.length; i++) {
	         System.out.printf("\n%d��° �л��� ����--------------------------\n\n", i + 1);
	         for(int j = 0; j < exams[i].length; j++) {
	        	 System.out.printf("%d��° ����\t", j + 1);
	        	 
	         }
	         System.out.printf("  ���\t");
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
