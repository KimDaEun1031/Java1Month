
public class Ex04_080910 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4-8 예제
		//비트 논리곱 사용 1 1 만 트루 나머지는 펠스
		System.out.printf("10 & 7 = %d \n", 10&7);
		System.out.printf("123 & 456 = %d \n", 123&456);
		System.out.printf("0xFFFF & 0000 = %d \n", 0xFFFF & 0000);
		//16진수 ffff는 1만 있고 0000은 0만 있기에 논리곱을 사용하면 이렇게 된다.
		// 1111 1111 1111 1111
		// 0000 0000 0000 0000
		//--------------------- <- 0과 1만 있기에 무조건 펠스 그래서 0이 나온다.
		// 0000 0000 0000 0000
		
		//4-9예제
		//비트 논리합 사용 0 0만 펠스 나머지는 트루
		System.out.printf("\n10 | 7 = %d \n", 10|7);
		System.out.printf("123 | 456 = %d \n", 123|456);
		System.out.printf("10진수로 출력한 0xFFFF | 0000 = %d \n", 0xFFFF | 0000);
		System.out.printf("16진수로 출력한 0xFFFF | 0000 = %x \n", 0xFFFF | 0000);
		
		//4-10예제
		//지트 배타적 논리합 연산자 1 0 0 1만 트루 같은 건 펠스 
		System.out.printf("\n10 ^ 7 = %d \n", 10^7);
		System.out.printf("123 ^ 456 = %d \n", 123^456);
		System.out.printf("10진수로 출력한 0xFFFF ^ 0000 = %d \n", 0xFFFF ^ 0000);
		System.out.printf("16진수로 출력한 0xFFFF ^ 0000 = %x \n", 0xFFFF ^ 0000);
		// ^ = 6번을 봐라
		
		
		
		//
	}

}
