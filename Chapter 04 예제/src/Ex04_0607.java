
public class Ex04_0607 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 99;
		boolean result = (a >= 100) && (a <= 200);
		         System.out.println(result);
		
		result = (a >= 100) || (a <= 200);
		System.out.println(result);
		
		result = !(a == 100);
		System.out.println(result);
		
		
		int x = 3;
		int y = 4;
		
		int max = x>y?++x:++y;//연산에 참여하지만 실행되지 않으면 식이 성립되지 않음
		                      //조건식 ? 참 : 펠스 
								// 에서 조건식이 틀려서 펠스 쪽을 실행하면 참인 쪽은 실행되지 않으니
		                      // 처음 설정한 값이 그대로 나오는 거임
		System.out.printf("max = %d, x = %d, y = %d ",y,x,y);
		
		
		//4-7예제
		int num1 = 100;
		int num2 = -200;
		
		boolean fin = (num1 != 0);
		boolean fin1 = (num2 != 0);
		
		System.out.printf("\n\n상수의 AND 연산 : %s \n",fin && fin1);
		System.out.printf("상수의 OR 연산 : %s \n",fin || fin1);
		System.out.printf("상수의 NOT 연산 : %s \n", !fin);
		
		//4-6예제
		a = 99;
		System.out.printf("\n\nAND 연산 : %s \n", (a>=100) && (a<=200));
		System.out.printf("OR 연산 : %s \n", (a>=100) || (a<=200));
		System.out.printf("NOT 연산 : %s \n", !(a==100));
	}
	
	

}
