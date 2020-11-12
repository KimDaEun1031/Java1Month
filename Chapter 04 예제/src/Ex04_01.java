
public class Ex04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b = 5;
		int c = 3;
		
		//제일 중요한 것 정수는 정수의 값을 나오게 한다.
		
		a = b +  c;
		System.out.printf("%d + %d = %d\n", b , c ,a);
		
		a = b - c;
		System.out.printf("%d - %d = %d\n", b , c ,a);
		
		a = b * c;
		System.out.printf("%d * %d = %d\n", b , c ,a);

		a = b / c;
		System.out.printf("%d / %d = %d\n", b , c ,a);
		
		a = b % c;
		System.out.printf("%d %% %d = %d\n", b , c ,a);
		             // %가 하나면 형식기호로 인식해서 수식으로 인정하지 않는 거기에
		             // %앞에 %를 붙여서 완료
		
		//선생님 예제
		short s1 = 10;
		short s2 = 20;
		short s3 = (short)(s1 + s2);
		System.out.println(s3);
		//short s3 = [ s1 + s2 ];
		// []안이 컴파일 오류가 나는 이유가 나는 이유는 변수 s1, s2의 값은 정수인데
		// 정수끼리 더하면 정수이다 정수는 인티저이다.
		//쇼트도 정수지만 아주 작은 정수의 값을 가지고 있기에 지금의 값은 쇼트라는 데이터에
		// 넣을  수 없다고 말하는 거다.
		// 즉 연산의 결과가 인티저 값이니까 쇼트에 넣지 못하도록 자바가 막은 것이다
		// 이때 s3 = (short)(s1 + s2)을 한다면 인티저를 쇼트로 바꿔 내가 책임질게라고 자바한테 말한거임
		          // 강제 변환한다는 뜻이다. 값이 나옴 30으로
		
		float f1 = 20000.0f;
		double d1 = 30000.1234;
		
		d1 = f1;//<- 얘를 주석처리하면 f에 초점이 맞춰진다. 
		        // 하지만 f는 정확하지 않기 때문에 없다고 봐도 무방 63번줄을 보기
		f1 = (float)d1;
		System.out.printf("%f : %f\n", f1 , d1);
		
		//롱에 플롯의 값을 대입했을 때
		long l1 = 2000000000000000000l;
		f1 = l1;
		System.out.println(f1);
		
		//롱을 플롯과 더블에 대입했을 때
		f1 = l1;
		d1 = l1;
		System.out.printf("%f, %f\n" ,f1 ,d1);
		
		
		//큰 타입에서 작은 타입으로 이동한다면 손실이 발생한다.
		
	}

}
