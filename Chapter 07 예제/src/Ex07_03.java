import java.util.Scanner;

public class Ex07_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a=0,b = 0;
		int result = a+b;
		
		
		while(true) {
			System.out.printf("ù��° �� �Է� : ");
			a = s.nextInt();
			System.out.printf("�ι�° �� �Է� : ");
			b = s.nextInt();
			
			System.out.printf("%d + %d = %d\n",a,b,result);
			if(result==999) 
				break;
				
		}
		
		
	}

}
