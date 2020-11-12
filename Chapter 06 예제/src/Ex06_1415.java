
public class Ex06_1415 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,k;
		for(i=1;i<=9;i++) {
			for(k=1;k<=9;k++) {
				System.out.printf("%d X %d = %d\t",k,i,k*i);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		for(i=1;i<=9;i++) {
			for(k=1;k<=9;k++) {
				System.out.printf("%3d X %d = %2d",k,i,k*i);
				//%와 3d사이에 숫자나 문자를 넣어보면 공백이 얼마나 나오는지 알 수 있음
				//결과값은 2d로 되어있는데 1d로 해보니 공백이 없어졌다.
				//즉 1d나 d는 같은거고 2부터 셈이 되어서 3d는 2칸 공백
				//2d는 1칸 공백이 생기는 거다.
			}
			System.out.println();
		}
		
		
		
		

	}

}
