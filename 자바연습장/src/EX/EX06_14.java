package EX;

public class EX06_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구구단 만들기(가로)
		//9번 반복한 걸 9번 반복되게
		
		int a, b;
		
		for(a=1;a<=9;a++) {
			for(b=1;b<=9;b++) {
				System.out.printf("%d X %d = %d \t", b, a, a*b);
				                             //\t 대신에 \n을 넣으면 세로줄로 형성
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		

		//거꾸로 만들기
		for(a=9;a>=1;a--) {
			for(b=1;b<=9;b++) {
				System.out.printf("%d X %d = %d \t", b, a, a*b);
				                             //\t 대신에 \n을 넣으면 세로줄로 형성
			}
			System.out.println();
		}
	}

}
