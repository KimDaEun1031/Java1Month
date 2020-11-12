import java.util.Scanner;

public class Ex07_17_01 {
	//입력한 두 수 사이의 합계를 구하되 원하는 배수를 선택하여 합계를 구하는 프로그램

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int first;
		int fin;
		int num;
		int result=0;
		
		System.out.printf("합계의 시작값(무조건 작음) : ");
		first = s.nextInt();
		System.out.printf("합계의 끝값(무조건 큼) : ");
		fin = s.nextInt();
		System.out.printf("배수 : ");
		num = s.nextInt();
		
		int i = first;
		while(i<=fin) {
			i++;
			if(i%num==0) {
				result += i;
			}
		}
		System.out.printf("%d부터 %d까지의 %d배수의 합 : %d",first,fin,num,result);
		

	}

}
