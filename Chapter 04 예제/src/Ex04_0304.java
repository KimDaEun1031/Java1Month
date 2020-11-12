
public class Ex04_0304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		a++;
		System.out.println(a);
		a--;
		System.out.println(a);
		a += 5; //=+ 처럼 쓰지 말것 + 나 - 는 숫자기호로 분류됨
		        // +5나 -5처럼 됨
		System.out.println(a);
		System.out.println();
		
		int i1 = 10;
		int i2 = 10;
		int r1 = 2 * ++i1; //증가하고 곱하기고
		int r2 = 2 * i2++; //곱하기하고 대입하고 그 후에 i2가 증가
		                   // 즉 i2*2를 먼저 하고 그럼 20이지? 걔를 r2에 대입하고 난 후 증감식이 발동
		                   //그래서 i2도 11일 됨
		
		System.out.printf("i1 = %d, i2 = %d, r1 = %d ,r2 = %d", i1 , i2 , r1 , r2);
		System.out.println();
		System.out.println();
		
		//영우씨가 증감연산자 이해하라고 준 예제
		a = 10;
	      System.out.println(a++);
	      System.out.println(a);
	      
	      int b = 10;
	            System.out.println(++b);
	      System.out.println(b);
		
	    //4-4예제
	      a = 10;
	     
	      
	      b = a++;
	      System.out.printf("\n%d \n", b );
	      
	      b = ++a;
	      System.out.printf("%d \n", b);
		
		
	}

}
