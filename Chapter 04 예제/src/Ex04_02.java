
public class Ex04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 3;
		int c = 4;
		
		int result1;
		int mok;
		int namugi;
		float result2;
		
		result1 = a + b - c;
		System.out.printf("%d + %d - %d = %d \n", a , b, c, result1 );
		
		result1 = a + b + c;
		System.out.printf("%d + %d + %d = %d \n", a , b, c, result1 );
		
		result2 = a + b / (float)c;
		System.out.printf("%d + %d / %d = %f \n", a , b, c, result2);
		//4-1예제에서 배운 강제 형 변환은 원래 4-2예제에서 배우는 거였음.
		//만약 형 변환을 하지 않는다면 값은 정수+정수/정수가 되어 2가 나옴
		//결과 값을 float으로 바꾸어도 2.0이 될 뿐 
		//하지만 강제 형변환을 한다면 (float)을 넣어서 형변환
		//값은 콘솔에서 나온 것 처럼 된다. 2.750000
		//반대로 실수+실수 였을 때는 (int)를 써서 정수로 형 변환을 시킨다
		//이렇게 강제 형 변환 해주는(int)와  (float)를 (cast) 연산자라고 한다. 중요
		mok = c / b;
		System.out.printf("%d / %d = %d \n", c, b, mok);
		
		namugi = c % b;
		System.out.printf("%d %% %d = %d \n\n", c, b, namugi); // %% 왜 이렇게 쓰는지 알지? 모르면 나가 뒤져
		
		//괄호를 사용한 우선순위
		//곱셈 나눗셈 덧셈 뺄셈 중 가장 우선순위로 계산되는 것은 곱셈과 나눗셈이다.
		// 하지만 괄호 안에 덧셈 혹은 뺄셈이 들어있고 그 후 곱셈과 나눗셈으로 계산된다면
		// 이런 형태의 식이 나올것이다.
		
		// 위에와 같은 형태지만 괄호를 넣어보겠다.
		
		result1 = (a + b) - c;
		System.out.printf("(%d + %d) - %d = %d \n", a , b, c, result1 );
		
		result1 = a + (b + c);
		System.out.printf("%d + (%d + %d) = %d \n", a , b, c, result1 );
		
		//덧셈과 뺄셈만 있는 식에서 괄호를 써도 답은 변하지 않는 것을 알았다. 
		
		result2 = (a + b) / (float)c;
		System.out.printf("(%d + %d) / %d = %f \n", a , b, c, result2);
		
		//하지만 더하기와 나눗셈이 합쳐진 식에 더하기에 괄호를 씌워 나눗셈보다 우선순위로 계산되게 만드니
		// 답이 달라졌다
		
		mok = c / b;
		System.out.printf("%d / %d = %d \n", c, b, mok);
		
		namugi = c % b;
		System.out.printf("%d %% %d = %d \n", c, b, namugi);
		
		//여기서 알수 있는 점!
		//괄호, 덧셈, 뺄셈, 나눗셈, 곱셈이 어떤 것 부터 우선 계산되냐
		// 괄호, 곱셈과 나눗셈, 덧셈과 뺄샘 순으로 우선 계산 된다.

	}

}
