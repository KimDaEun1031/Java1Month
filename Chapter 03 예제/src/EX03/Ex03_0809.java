package EX03;


public class Ex03_0809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3-8
		
		int a, b;
		float c, d;
		
		a = 100;
		b = a;
		
		c = 111.1f;
		d = c;
		
		System.out.printf("a, b의 값 ==> %d , %d \n" , a , b);
		System.out.printf("c, d의 값 ==> %5.1f , %5.1f \n" , c , d);
		
		
		//3-9
		int e , g;
		
		a = 100+100;
		b = a+100;
		
		e = a+b-100;
		g = a+b+e;
		
		System.out.printf("a, b, e, g의 값 ==> %d , %d, %d , %d \n" , a , b ,e ,g);
		
		a = b = e = g = 100;
		
		System.out.printf("a, b, e, g의 값 ==> %d , %d, %d , %d \n" , a , b ,e ,g);
		
		a = 100;
		a = a + 200;
		
		System.out.printf("a의 값 ==> %d \n" , a);
		

	}

}
