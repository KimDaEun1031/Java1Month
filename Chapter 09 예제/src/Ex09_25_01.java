import java.util.Random;
import java.util.Scanner;

public class Ex09_25_01 {
	static short Getnumber() {
		return (short) (Math.random() * 45 + 1);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short num1, i, k;
		short array [] = {0,0,0,0,0,0};
		char du = 'n';

		
		for(i=0;i<6;) {
			num1 = Getnumber();
			for(k=0;k<6;k++) 
				if(array[k]==num1) 
					du = 'z';
				if(du=='n') 
					array[i++] = num1;
				else 
					du ='n';
				}
		
		System.out.println("랜덤 번호");
		for(i = 0;i<6;i++) {
			System.out.printf("[ %d ],",array[i]);
		}
		
		
//		 Random rd = new Random();  //요런 방법 도 있다
//		 for(int i =0; i<6; i++) {
//			 System.out.print("["+(rd.nextInt(45)+1)+"]"); 
//		 }
		 

	}

}
