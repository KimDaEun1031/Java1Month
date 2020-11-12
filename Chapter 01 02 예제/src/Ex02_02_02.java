import java.util.Scanner;

public class Ex02_02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 내가 생각해서 만든 거임 예제 따로 안 봄 
		int a, b, c, result;	
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 계산할 값을 입력하세요. ==> ");
		a = s.nextInt();
		System.out.print("<1>덧셈,<2>뺄셈,<3>곱셈,<4>나누셈 선택하시오 ==> ");
		b = s.nextInt();
		if( b >= 5) {
			System.out.println("5 이상은 입력 하실 수 없습니다.");
			System.out.println("다시 입력해 주세요.");
			System.out.print("<1>덧셈,<2>뺄셈,<3>곱셈,<4>나누셈 선택하시오 ==> ");
			b = s.nextInt();
			}
		
		if( b <= 5) {
			System.out.print("두번째 계산할 값을 입력하세요. ==> ");
		}
			c = s.nextInt();

		
		if( b == 1 ) {
			result = a + b; //원래는 인트 바로 아래에 선언을 했는데 이프문에 같이 넣으면 더러워 보이지도 않고 좋은 듯
			System.out.println(a + "+" + c + "=" + result);
			}
		if( b == 2 ) {
			result = a - b;
			System.out.println(a + "-" + c + "=" + result);
			}
		if( b == 3 ) {
			result = a * b;
			System.out.println(a + "*" + c + "=" + result);
			}
		if( b == 4 ) { 
			result = a / b;
			System.out.println(a + "/" + c + "=" + result);
			}
	
	}

}
