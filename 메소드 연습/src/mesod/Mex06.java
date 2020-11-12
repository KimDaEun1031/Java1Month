package mesod;

public class Mex06 {

	public static void main(String[] args) {
		// 문자열 결합 시 인스턴스 생성
		
		String a = "a";
		String b = "b";
		String c = "c";
		
		c = a+b;
		System.out.println(c);
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode()); //c만 값이 큰 이유는 위에서 a와 b를 합쳤기에
		//a,b,c의 주소값을 10진수로 출력

	}

}
