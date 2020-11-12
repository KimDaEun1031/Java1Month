
public class Ex04_121314 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//비트 부정 연산자 ~
		int a = 12345;
		System.out.printf("%d \n", ~a);
		//~는 반전하기에 만약 6을 부정 연산자로 바꾸면
		// 1001 ==> 0110
		// 1의 보수를 취한 값에 2의 보수를 취함
		// 0110
		// +
		// 0001
		//-------
		// 0111 => 앞에 - 부호 붙이면 -7이 됨
		
		//시프트 연산자 
		a = 10;
		System.out.printf("%d를 왼쪽 1회 시프트 하면 %d 이다. \n", a , a<<1);
		System.out.printf("%d를 왼쪽 2회 시프트 하면 %d 이다. \n", a , a<<2);
		System.out.printf("%d를 왼쪽 3회 시프트 하면 %d 이다. \n", a , a<<3);
		//한 번 쉬프트 할 때 바다 2의 1승이라고 생각하면 됨
		//몇 번 쉬프트할 지 숫자를 적은 데가 몇 승이 됨
		//예로 a<<10이라고 하면 2의 10승이라고 생각하면 됨
		
		System.out.printf("%d를 오른쪽 1회 시프트 하면 %d 이다. \n", a , a>>1);
		System.out.printf("%d를 오른쪽 2회 시프트 하면 %d 이다. \n", a , a>>2);
		System.out.printf("%d를 오른쪽 3회 시프트 하면 %d 이다. \n", a , a>>3);
		
		
	}	

}
