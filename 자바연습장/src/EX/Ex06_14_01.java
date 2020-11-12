package EX;

public class Ex06_14_01 {
	//구구단과 제목을 같이 출력

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b,c;
		
		for(c=1;c<=9;c++) {
			System.out.printf("  #제%d단# \t", c);
		}
		
		System.out.println();
		System.out.println();
		
		for(a=1;a<=9;a++) {
			for(b=1;b<=9;b++) {
				//if(a==1) {
					//System.out.printf("  #제%d단# \t",a);
				//} 이게 되게 하고 싶다
				System.out.printf("%d X %d = %d \t", b ,a ,a*b);
			}
			System.out.println();
		}

	}

}
