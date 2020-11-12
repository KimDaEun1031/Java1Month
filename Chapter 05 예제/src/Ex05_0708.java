import java.util.Scanner;

public class Ex05_0708 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5-7
		int a = 75;
		if (a>50) {
			if (a<100) {
				System.out.printf("50보다 크고 100보다 작군요 \n\n\n");
			} else {
				System.out.printf("와~ 100보다 크군요 \n\n\n");
			}
		}else {
			System.out.printf("애걔~ 50보다 작군요..\n\n\n");
		}
		//5-8
		Scanner s = new Scanner(System.in);
		int b;
		
		System.out.printf("점수를 입력하세요 : ");
		b = s.nextInt();
		
		if(b>=90) 
			System.out.printf("A");
		else 
			if (b>=80)
				System.out.printf("B");
			else 
				if (b>=70)
					System.out.printf("C");
				else 
					if (b>=60)
						System.out.printf("D");
					else
						System.out.printf("F");
		
		
		System.out.printf(" 학점입니다. \n\n\n");
		//5-8 세분화
		System.out.printf("점수를 입력하세요 : ");
		b = s.nextInt();
		
		if(b>=95) 
			System.out.printf("A+");
		else if (b>=90)
				System.out.printf("A");
		else if (b>=85)
				System.out.printf("B+");
		else if (b>=80)
				System.out.printf("B");
		else if (b>=75)
				System.out.printf("C+");
		else if (b>=70)
				System.out.printf("C");
		else if (b>=65)
				System.out.printf("D+");
		else if (b>=60)
				System.out.printf("D");
		
		else
			System.out.printf("F");
		System.out.printf(" 학점입니다. \n\n\n");
		
		
		

	}

}
