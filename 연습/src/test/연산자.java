package test;

public class 연산자 {
	
	public static void main(String[] args) {
	

	int a;
	int b;
	float f;
	a = 10;
	b = 50;
	f = 0.593f;
	System.out.println("c의 값을 구하시오.");
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	System.out.println("f = " + f);
	System.out.println("c1 = " + (a+b));
	System.out.println("c2 = " + (a-b));
	System.out.println("c3 = " + (a*b));
	System.out.println("c4 = " + (a/b));
	System.out.println("c5 = " + (b/a)); //몫이라고 생각
	System.out.println("c6 = " + (b%a)); //%는 나머지가 나옴
	System.out.println("c7 = " + (f+a));
	System.out.println("c8 = " + (f+b));
	System.out.println("c9 = " + (f-a)); //float 말고 duoble도 있는데 더 범위가 큼
	System.out.println("c10 = " + (a=-10));
	}

}
