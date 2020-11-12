package EX;

public class Ex06_15_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//아스키 코드 표를 만들어보자
		int num;
		
		for(num=0;num<128;num++) {
			if(num%16==0) {
				System.out.printf("10진수    16진수     문자   \n");
			}
			System.out.printf("%5d   %5x    %5c\n",num,num,num);
				
		}
		
		
	}
				
}
	
		
