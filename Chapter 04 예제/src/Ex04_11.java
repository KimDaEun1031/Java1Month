
public class Ex04_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//비트 연산에 마스크를 사용하는  예제
		//마스크(mask)는 무엇을 걸러주는 역할을 한다.
		byte a = 'A', b;
		byte mask = 0x0F; //마스크 값 (0000 1111)을 설정한다.
		
		System.out.printf("%X & %X = %X \n", a, mask, a & mask);
		System.out.printf("%X |	%X = %X \n", a, mask, a | mask);//a와 mask의 논리곱 논리합 실행
		
		mask = 'a' - 'A'; //a와 A의 차이는 32이다.
		
		b = (byte)(a ^ mask);
		System.out.printf("%c ^ %d = %c \n", a, mask, b);//A와 mask의 배타적 논리합 실행
		a = (byte)(b ^ mask);
		System.out.printf("%c ^ %d = %c \n", b, mask, a);//a와 mask의 배타적 논리합 실행
	}

}
